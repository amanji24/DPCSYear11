import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Rule30 {

	public static void main(String [] args) {
		
		// Generate a random array and build a rule 30
		// box of width 31 and length 16 based on it.
		int[] arr = genLine(31);
		int[][] rule30BoxRand = rule30(arr, 16);
		
		// Generate an array with 1 in the middle
		// and all other elements 0, build a rule 30
		// box of width 31 and length 16 based on it.
		int[] arr1 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[][] rule30Box = rule30(arr1, 16);
		
		writeRowMajor(rule30BoxRand);
		
	}
	
	/**
	 * This function writes a 2D array 'in' to
	 * a file named 'output.txt' in 'files'
	 * by searching it row major and
	 * using a printwriter to print
	 * each element to the file.
	 * @param in
	 */
	
	public static void writeRowMajor(int[][] in) {
		
		// Tries to run code
		try {
			
			// Gets the file @ path
			File f = new File("files/output.txt");
						
			// Creates a 'file writer', allows us to write to a file
			FileWriter fw = new FileWriter(f);
			
			// Creates a 'print writer', lets us use normal print functions
			// with a file
			PrintWriter pw = new PrintWriter(fw);
			
			// Loops through the array 'in' row major
			// Prints each element to file
			for (int r = 0; r < in.length; r++) {
				int[] temp = in[r];
				for (int c = 0; c < temp.length; c++) {
					// Print out the element of 'in' at index [r][c]
					pw.print(""+in[r][c]);
				}
				// Make new line
				pw.println("");
			}
			
			// Closes print writer
		    pw.close();
			
		// Catches the error 'File not found'
		} catch (IOException e) {
			
			// Prints out the error
			System.out.print("File not found");
			
		}
		
	}
	
	/**
	 * This function prints an int array by
	 * running through it and printing each
	 * element.
	 * @param in
	 */
	
	public static void printArray(int[] in) {
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i]);
		}
		System.out.println("");
	}
	
	/**
	 * This function prints a 2D array by
	 * searching it row major and printing
	 * each element.
	 * @param in
	 */
	
	public static void rowMajor(int[][] in) {
		for (int r = 0; r < in.length; r++) {
			int[] temp = in[r];
			for (int c = 0; c < temp.length; c++) {
				System.out.print(in[r][c]);
			}
			System.out.println("");
		}
	}
	
	/**
	 * This method generates an int array
	 * of length 'size' filled with
	 * 0's and 1's which it returns.
	 * 
	 * @param size
	 * @return
	 */
	
	public static int[] genLine(int size) {
		int[] out = new int[size];
		for (int i = 0; i < out.length; i++) {
			out[i] = (int) (Math.random()*2);
			while (out[i] == 2) {
				out[i] = (int) (Math.random()*2);
			}
		}
		return out;
	}
	
	/**
	 * This method takes in the first row of the 2D array
	 * and the number of rows to make in total.
	 * It then generates a new 2D int array out, which
	 * it returns. The array is filled with 0's and 1's,
	 * representing empty and filled in spaces
	 * respectively.
	 * It runs through the array row major and for each
	 * set of 3 elements it determines whether the
	 * space below the middle element should be filled
	 * in based on the Rule30 rules.
	 * 
	 * @param in
	 * @param rows
	 * @return
	 */
	
	public static int[][] rule30(int[] in, int rows) {
		int[][] out = new int[rows][in.length];
		out[0] = in;
		for (int r = 0; r < out.length-1; r++) {
			int[] temp = out[r];
			for (int c = 0; c < temp.length; c++) {
				int[] test = new int[3];
				if (c == 0) {
					test[0] = 0;
					test[1] = temp[0];
					test[2] = temp[1];
				} else if (c == temp.length-1) {
					test[0] = temp[c-1];
					test[1] = temp[c];
					test[2] = 0;
				} else {
					test[0] = temp[c-1];
					test[1] = temp[c];
					test[2] = temp[c+1];
				}
				out[r+1][c] = checkTest(test);
			}
		}
		
		return out;
	}
	
	/**
	 * This method tests if the block below should
	 * be filled in based on the three element
	 * array representing the blocks above it.
	 * Using the Rule30 rules, it returns
	 * either a 1 or 0 for filled or empty
	 * respectively.
	 * 
	 * Pre-condition: test is an int[]
	 * Post-condition: test is unchanged
	 * 
	 * @param test
	 * @return
	 */
	
	public static int checkTest(int[] test) {
		int[] case1 = {1,0,0};
		int[] case2 = {0,1,1};
		int[] case3 = {0,1,0};
		int[] case4 = {0,0,1};
		
		if (Arrays.equals(test, case1)) {
			return 1;
		} else if (Arrays.equals(test, case2)) {
			return 1;
		} else if (Arrays.equals(test, case3)) {
			return 1;
		} else if (Arrays.equals(test, case4)) {
			return 1;
		}
		return 0;
	}
	
}
