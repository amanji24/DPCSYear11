import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class $ASM {

	public static void main(String[] args) {

		/*Queue<String> q1 = new LinkedList<>();
		q1.add("one");
		q1.add("two");
		q1.add("three");
		System.out.println(q1);
		reverseQueue(q1);
		System.out.println(q1);*/
		
		/*int[][] myArr = {{3,5,7}, {2,1,5}};
		print2DRowMajor(myArr);
		print("\n");
		print2DColumnMajor(myArr);
		print("\n");
		print2DRowMajor(createRandom2DArray(3,2));
		*/
		
		/*boolean thisisjusttotest = isPrime(1001);
		print("");
		boolean thisisjusttotest2 = isPrime(7);*/
		
		/*
		
		int[][] spiral = spiralArrayGenerator(5);
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				int numatind = spiral[row][col];
				String toprint = numatind + "";
				if (numatind < 10) {
					toprint = "0" + toprint;
				}
				System.out.print(toprint + " ");
			}
			print("");
		}
		
		*/
		
		print(redact("preliminary"));
		
		print(after("bananaphone", 'n', 6));
		
	}
	
	
	
	
	
	
	public static String after(String s, char c, int n) {
		
		int ind = s.indexOf(c)+1;
		
		return s.substring(ind,ind+n);
		
	}
	
	
	public static String redact(String s) {
		
		if (s.length() < 3) {
			return s;
		}
		
		return s.substring(0,1) + "xxx" + s.substring(s.length()-1);
		
	}
	
	
	
	public static int[][] spiralArrayGenerator(int n) {
		
		int[][] spiral = new int[n][n];
		int z = 1;
		int t = 0;
		int b = n-1;
		int l = 0;
		int r = n-1;
		
		while (z <= n*n) {
			
			for (int i = l; i <= r; i++) {
				spiral[t][i] = z;
				z++;
			}
			t++;
			for (int i = t; i <= b; i++) {
				spiral[i][r] = z;
				z++;
			}
			r--;
			for (int i = r; i >= l; i--) {
				spiral[b][i] = z;
				z++;
			}
			b--;
			for (int i = b; i >= t; i--) {
				spiral[i][l] = z;
				z++;
			}
			l++;
		}
		
		
		return spiral;
		
	}
	
	
	public static int[][] HLP1NOV201714() {
		
		int[] values = {7,-3,9,-1,-6,-5,1};
		int[] rowc = {1,1,3,3,4,7};
		int[] col = {0,2,4,2,1,4,5};
		
		int[][] mat = new int[rowc.length][rowc.length];
		
		int valsadded = 0;
		int rownum = 0;
		
		while (rownum < rowc.length) {
			if (valsadded == rowc[rownum]) {
				rownum++;
			}
			mat[rownum][col[valsadded]] = values[valsadded];
			valsadded++;
			if (valsadded == rowc[rownum]) {
				rownum++;
			}
		}
		
		return mat;
		
	}
	
	
	public static boolean isPrime(int n) {
		boolean prime = true;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		factors.add(1);
		factors.add(n);
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				factors.add(i);
				prime = false;
			}
		}
		if (factors.size() > 2) {
			print(n + " is not prime.");
		} else {
			print(n + " is prime.");
		}
		print("The factors of " + n + " are " + factors);
		return prime;
	}
	
	
	
	
	
	
	
	
	
	public static int[][] createRandom2DArray(int rows, int columns) {
		int[][] arr = new int[rows][columns];
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = (int) (Math.random()*100);
			}
		}
		return arr;
	}
	
	public static void print2DRowMajor(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				print(arr[r][c]);
			}
		}
	}
	
	public static void print2DRowMajor(String[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void print2DColumnMajor(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			for (int r = 0; r < arr.length; r++) {
				print(arr[r][c]);
			}
		}
	}
	
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void print(int s) {
		System.out.println(s);
	}
	
	public static void print(double s) {
		System.out.println(s);
	}
	
	public static void print(float s) {
		System.out.println(s);
	}
	
	public static void print(boolean s) {
		System.out.println(s);
	}
	
	
	public static void print(String[] s) {
		String out = "[";
		for (String st : s) {
			out += st + ", ";
		}
		System.out.println(out.substring(0,out.length()-2) + "]");
	}
	
	public static void print(int[] s) {
		String out = "[";
		for (int st : s) {
			out += st + ", ";
		}
		System.out.println(out.substring(0,out.length()-2) + "]");
	}
	
	public static void print(double[] s) {
		String out = "[";
		for (double st : s) {
			out += st + ", ";
		}
		System.out.println(out.substring(0,out.length()-2) + "]");
	}
	
	public static void print(float[] s) {
		String out = "[";
		for (float st : s) {
			out += st + ", ";
		}
		System.out.println(out.substring(0,out.length()-2) + "]");
	}
	
	public static void print(boolean[] s) {
		String out = "[";
		for (boolean st : s) {
			out += st + ", ";
		}
		System.out.println(out.substring(0,out.length()-2) + "]");
	}
	
	
	
	public static int getLowest(ArrayList<Integer> in) {
		int min = in.get(0);
		for (int i : in) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	
	
	static List<String> words = Arrays.asList();
	
	
	
	public static String strWordFinder(String pg) {
		String out = "";
		String[] strWords = pg.split(" ");
		for (String word : strWords) {
			if (word.endsWith("...")) {
				if (words.contains(word.substring(0,word.length()-3)) || words.contains(word.substring(0,word.length()-3).toLowerCase())) {
					out += word;
				} else {
					for (int i = 0; i < word.length(); i++) {
						out += "*";
					}
				}
			} else if (word.endsWith(".") || word.endsWith(",") || word.endsWith("!") || word.endsWith("?") || word.endsWith("*") || word.endsWith(":") || word.endsWith(";")) {
				if (words.contains(word.substring(0,word.length()-1)) || words.contains(word.substring(0,word.length()-1).toLowerCase())) {
					out += word;
				} else {
					for (int i = 0; i < word.length(); i++) {
						out += "*";
					}
				}
			} else {
				if (words.contains(word) || words.contains(word.toLowerCase())) {
					out += word;
				} else {
					for (int i = 0; i < word.length(); i++) {
						out += "*";
					}
				}
			}
			out += " ";
		}
		return out;
	}
	
	
	
	
	public static void queueOrStack(Queue<String> q, Stack<String> s) {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void reverseQueue(Queue<String> q) {
		Stack<String> s = new Stack<String>();
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
	}
	
	
	
	
	/**
	 * This program takes a 2D integer array filled with 2-element arrays containing an x value and y value (displacement from origin)
	 * It adds all these 'vectors' together
	 * 
	 * Pre-condition: takes 2D int array with 2-el int arrays inside
	 * Post-condition: none
	 * 
	 * @param vectors
	 * @return
	 */
	
	public static int[] vectorAddition(int[][] vectors) {
		int[] out = new int[2];
		for (int i = 0; i < vectors.length; i++) {
			int[] vector = vectors[i];
			for (int j = 0; j < vector.length; j++) {
				out[j] = out[j] + vector[j];
			}
		}
		return out;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static String paragraph(int num, int words) {
		
		Random random = new Random();
		String out = "";
		int lenCt = 0;
		int pdPlace = random.nextInt(15) + 8;
		int wdCt = 0;
		
		for (int i = 0; i < num; i++) {
			String paragraph = "" + (char) (random.nextInt(26) + 'A');
			for (int j = 0; j < words; j++) {
				int randNum = random.nextInt(5) + 3;
				for (int k = 0; k < randNum; k++) {
					if (lenCt == 142) {
						paragraph += "\n";
						lenCt = 0;
					}
					paragraph += (char) (random.nextInt(26) + 'a');
					lenCt++;
				}
				if (wdCt == pdPlace) {
					wdCt = 0;
					pdPlace = random.nextInt(15) + 8;
					paragraph += ".";
				}
				paragraph += " ";
				wdCt++;
			}
			paragraph = paragraph.substring(0,paragraph.length()-1);
			paragraph += ".\n\n";
			lenCt = 0;
			wdCt = 0;
			pdPlace = random.nextInt(15) + 8;
			out += paragraph;
		}
		
		return out;
		
	}
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static boolean isEven(int a) {
		return a % 2 == 0;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int findSum(int a, int b) {
		return a + b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int findAbsolueDifference(int a, int b) {
		return Math.abs(a-b);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int findLargeSum(int a, int b, int c) {
		if (c < b && c < a) {
			return a + b;
		}
		if (b < c && b < a) {
			return a + c;
		}
		if (a < b && a < c) {
			return b + c;
		}
		return 0;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double findHyp(double a, double b) {
		return Math.sqrt(a*a+b*b);
	}
	
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static Integer findReverse(int a) {
		return((a%10*10) + (a/10));
	}
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static Integer findSumDigits(int a) {
		if (a == 1000) {
			return 1;
		}
		if (a > 99) {
			return a / 100 + a % 100 / 10 + a % 10;
		}
		if (a > 9) {
			return a / 10 + a % 10;
		}
		return a;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static double roundToN(double a, int b) {
		int intPart = (int) a / 1;
		double decPart = a - intPart;
		decPart *= Math.pow(10, b);
		decPart = Math.round(decPart);
		decPart /= Math.pow(10, b);
		return (double) intPart + decPart;
	}
	
	
	public static double findCircleArea(double a) {
		double added = 0;
		if (a < 0) {
			return -1;
		}
		double area = Math.PI*(a*a);
		area *= 1000;
		if (area - (int) area >= 0.5) {
			added = 0.001;
		}
		int areaInt = (int) area;
		area = (double) areaInt;
		area /= 1000;
		return area + added;
	}
	
	public static double solveCircleRadius(double area) {
		double added = 0;
		if (area < 0) {
			return -1;
		}
		double a = Math.sqrt(area/(Math.PI));
		a *= 1000;
		if (a - (int) a >= 0.5) {
			added = 0.001;
		}
		int aInt = (int) a;
		a = (double) aInt;
		a /= 1000;
		return a + added;
	}
	
	
	
	
	
	public static String readBraille(String a) {
		ArrayList<String> braille = new ArrayList<String>();
		braille.add("xooooo");
		braille.add("xoxooo");
		braille.add("xxoooo");
		braille.add("xxoxoo");
		braille.add("xooxoo");
		braille.add("xxxooo");
		braille.add("xxxxoo");
		braille.add("xoxxoo");
		braille.add("oxxooo");
		braille.add("oxxxoo");
		braille.add("xoooxo");
		braille.add("xoxoxo");
		braille.add("xxooxo");
		braille.add("xxoxxo");
		braille.add("xooxxo");
		braille.add("xxxoxo");
		braille.add("xxxxxo");
		braille.add("xoxxxo");
		braille.add("oxxoxo");
		braille.add("oxxxxo");
		braille.add("xoooxx");
		braille.add("xoxoxx");
		braille.add("oxxxox");
		braille.add("xxooxx");
		braille.add("xxoxxx");
		braille.add("xooxxx");
		braille.add("oooooo");
		
		ArrayList<String> alphabet = new ArrayList<String>();
		alphabet.add("a");
		alphabet.add("b");
		alphabet.add("c");
		alphabet.add("d");
		alphabet.add("e");
		alphabet.add("f");
		alphabet.add("g");
		alphabet.add("h");
		alphabet.add("i");
		alphabet.add("j");
		alphabet.add("k");
		alphabet.add("l");
		alphabet.add("m");
		alphabet.add("n");
		alphabet.add("o");
		alphabet.add("p");
		alphabet.add("q");
		alphabet.add("r");
		alphabet.add("s");
		alphabet.add("t");
		alphabet.add("u");
		alphabet.add("v");
		alphabet.add("w");
		alphabet.add("x");
		alphabet.add("y");
		alphabet.add("z");
		alphabet.add(" ");
							
		String realInput = "";
		int len = a.length()/6;
		
		ArrayList<String> characters = new ArrayList<String>();
		
		for (int i = 0; i < len; i+=6) {
			String str = a.substring(i, i+6);
			characters.add(str);
		}
		
		String output = "";
		
		for (int i = 0; i < characters.size(); i++) {
			for (int i2 = 0; i2 < 27; i2++) {
				if (characters.get(i).equals(braille.get(i2))) {
					output += alphabet.get(i2);
					break;
				}
			}
		}
		
		return output;
		
	}
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static String addString(String a, String b) {
		return a + b;
	}
	
	
	/**
	 * This method takes a base 2 value and returns the base 10 value
	 * @param n
	 * @return
	 * 
	 * pre-condition: n can only contain 1 and 0 digits.
	 */
	public static int base2To10A(int n) {
		
		int pwr = 0;
		int r = 0;
		
		while (n > 0) {
			int x = n % 10;
			n /= 10;
			r += x * Math.pow(2, pwr);
			pwr++;
		}
		
		return r;
		
	}
	
	public static int base2To10B(int n) {
		
		/*
		 * Convert to a string instead of using the mod int div process
		 */
		String value = "" + n;
		int pwr = 0;
		int r = 0;
		
		//Bread and butter algorith: looping through a string and accessing each element
		//Looping throuhg string or array in reverse
		
		for (int i = value.length()-1; i > -1; i--) {
			
			//Step 1: access the right most digit cast to int
			int x = Integer.parseInt(""+value.charAt(i));
			r += x*Math.pow(2, pwr);
			pwr++;
			
		}
		
		return r;
		
	}
	
	
	
	public static int base10ToBase2(int n) {
		String out = "";
		while (n > 0) {
			int x = n % 2;
			n /= 2;
			out = x + out;
		}
		return Integer.parseInt(out);
	}
	
	public static String base10ToBaseN(int n, int base) {
		
		
		String[] hexDigits = {"a","b","c","d","e","f"};
		String out = "";
		while (n > 0) {
			int x = n % base;
			n /= base;
			String dig = "";
			if (x > 9) {
				dig = hexDigits[x-10];
			} else {
				dig = ""+x;
			}
			out = dig + out;
		}
		return out;
	}
	
	public static int indexOf(int[] arr, int a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				return i;
			}
		}
		return -1;
	}
	
	public static int indexOf(String[] arr, String a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(a)) {
				return i;
			}
		}
		return -1;
	}
	
	public static String complexRoot(int x) {
		String out = "";
		if (x >= 0) {
			return "" + Math.sqrt(x);
		}
		int rooted = 0;
		int extra = 1;
		while (extra != 0) {
			if (rooted != 0) {
				out += "+";
			}
			int tester = 1;
			while (tester*tester <= Math.abs(x)) {
				rooted = tester;
				extra = Math.abs(x) - (tester*tester);
				tester++;
			}
			x += rooted*rooted;
			if (rooted != 1) {
				out += rooted + "i";
			} else {
				out += "i";
			}
		}
		return "THIS TOOL IS NOT WORKING YET | " + out;
	}
	
	
	/**
	 * 
	 * This function takes an array of integers and returns the sum of the digits.
	 * 
	 * @param a
	 * @return
	 * 
	 * Pre-condition: All elements are 2 digits in length
	 * Post-condition: a is not canged when the function is done
	 * 
	 */
	public static int findArray2DigitSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			sum += num % 10;
			sum += num/10;
		}
		return sum;
	}
	
	public static int findArrayDigitSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int len = ("" + num).length();
			for (int j = 0; j < len; j++) {
				sum += num % 10;
				num /= 10;
			}
		}
		return sum;
	}
	
	/**
	 * This function takes a String array and finds smallest alphabetical value
	 * @param a
	 * @return
	 */
	public static String findAlphaSmallest(String[] a) {
		String[] b = a;
		Arrays.sort(b);
		return b[0];
	}
	
}
