import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotatingLetters {
	
	static ArrayList<String> letters = new ArrayList<String>(Arrays.asList("I", "O", "S", "H", "Z", "X", "N"));

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (1 > 0) {
			String input = s.nextLine();
			System.out.println(ok(input));
		}
		
	}
	
	public static String ok(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (!letters.contains(a.charAt(i))) {
				return "NO";
			}
		}
		return "YES";
	}

}
