import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Deletethis {

	public static void main(String[] args) throws FileNotFoundException {

		myfun();
		
	}
	
	public static void myfun() throws FileNotFoundException {
		
		ArrayList<String> words = new ArrayList<String>();
		Scanner s = new Scanner(new File("files/input.txt"));
		
		while (s.hasNextLine()) {
			words.add(s.nextLine());
		}
		
		for (String word : words) {
			
			int size = word.length()+2;
			String[][] out = new String[size][size];
			
			for (int r = 0; r < out.length; r++) {
				for (int c = 0; c < out[r].length; c++) {
					out[r][c] = "*";
				}
			}
			
			String[] top = out[0];
			for (int i = 1; i < size-1; i++) {
				top[i] = word.substring(i-1,i);
			}
			
			String[] bottom = out[size-1];
			for (int i = size-2; i > 0; i--) {
				bottom[i] = word.substring(word.length()-i, word.length()-i+1);
			}
			
			for (int i = 1; i < size-1; i++) {
				out[i][size-1] = word.substring(i-1,i);
			}
			
			for (int i = size-2; i > 0; i--) {
				out[i][0] = word.substring(word.length()-i, word.length()-i+1);
			}
			
			$ASM.print2DRowMajor(out);
			
			System.out.println("");
			
		}
		
	}
	
}
