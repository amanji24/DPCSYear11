import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BigBangSecrets {

	// public static = modifiers
		// public = anyone can use
		// static
	// void = returns
	// (String[] args) = parameter
	
	public static void main(String[] args) {
		
		System.out.println(bigBang2());
		
	}
	
	public static String bigBang() {
		ArrayList<String> alpha = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
		int k = 0;
		String base = "";
		Scanner s = new Scanner(System.in);
		k = s.nextInt();
		base = s.next();
		String out = "";
		int len = base.length();
		for (int i = 0; i < len; i++) {
			int shift = 3*(i+1) + k;
			String lToS = "" + base.charAt(i);
			int ind1 = alpha.indexOf(lToS);
			int ind2 = ind1 - shift;
			if (ind2 < 0) {
				ind2 += 26;
			}
			out += alpha.get(ind2);
		}
		return out;
	}
	
	public static String bigBang2() {
		int k = 0;
		String base = "";
		Scanner s = new Scanner(System.in);
		k = s.nextInt();
		base = s.next();
		String out = "";
		int len = base.length();
		for (int i = 0; i < len; i++) {
			int shift = 3*(i+1) + k;
			int ind1 = base.charAt(i);
			int ind2 = ind1 - shift;
			if (ind2 < 65) {
				ind2 += 26;
			}
			out += (char) ind2;
		}
		return out;
	}

}
