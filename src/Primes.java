import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(check());
		}
		
	}
	
	public static String check() {
		Scanner s2 = new Scanner(System.in);
		int n = s2.nextInt();
		
		for (int i = n; i > 1; i--) {
			boolean iPrime = true;
			boolean oppPrime = true;
			int opp = n + (n-i);
			for (int a = i-1; a > 1; a--) {
				double x = (double) i / (double) a;
				if (x - (int) x == 0) {
					iPrime = false;
				}
			}
			if (iPrime) {
				for (int a = opp-1; a > 1; a--) {
					double x = (double) opp / (double) a;
					if (x - (int) x == 0) {
						oppPrime = false;
					}
				}
			}
			if (iPrime && oppPrime) {
				return("" + i + " " + opp);
			}
		}
		
		return "";
	}

}
