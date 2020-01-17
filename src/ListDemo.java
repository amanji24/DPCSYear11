import java.util.ArrayList;
import java.util.Arrays;

public class ListDemo {

	public static void main(String[] args) {

		// Reference type = Object type

		ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('e','i','c','a','f','z','y','o','e'));
		System.out.println(getVowels(list));
		
	}
	
	public static ArrayList<Character> getVowels(ArrayList<Character> list) {
		ArrayList<Character> vowels = new ArrayList<Character>();
		for (char c : list) {
			if ("aeiou".indexOf(c) != -1) {
				vowels.add(c);
			}
		}
		for (char vowel : vowels) {
			list.remove(Character.valueOf(vowel));
		}	
		return list;
	}
	
	public static void doThis(ArrayList<Character> list) {
		
		
		ArrayList<Character> vow = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
		
		
		list.removeAll(vow);
		System.out.println(list);
		
	}

}
