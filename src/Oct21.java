import java.util.Stack;

public class Oct21 {

	public static void main(String[] args) {

		//Creating a Stack
		//REFERENCE TYPE = new OBJECT TYPE
		//It tells you what to expect when you follow the reference to the object
		
		Stack<String> stackOfCards = new Stack<>();
		stackOfCards.push("orange");
		stackOfCards.push("apple");
		stackOfCards.push("banana");
		stackOfCards.push("watermelon");
		System.out.println("Stack: " + stackOfCards);
		System.out.println("First Item (alphabetically): " + findAlphaSmallest(stackOfCards));
		System.out.println("Stack: " + stackOfCards);
		
	}
	
	public static String findAlphaSmallest(Stack<String> s) {
		String out = s.pop();
		Stack<String> temp = new Stack<>();
		temp.push(out);
		while (!s.isEmpty()) {
			temp.push(s.pop());
		}
		while (!temp.isEmpty()) {
			String str = temp.pop();
			if (str.charAt(0) < out.charAt(0)) {
				out = str;
			}
			s.push(str);
		}
		return out;
	}
	
	public static Stack<String> reverseStack(Stack<String> s) {
		Stack<String> s2 = new Stack<String>();
		Stack<String> s3 = new Stack<String>();
		
		while (!s.isEmpty()) {
			String str = s.pop();
			s2.push(str);
			s3.push(str);
		}
		
		while (!s3.isEmpty()) {
			String str = s3.pop();
			s.push(str);
		}
		
		return s2;
	}

}
