import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class StackFileAccess {

	public static void main(String[] args) {

		Stack<Integer> stack1 = readToIntStack("files/dataINT.txt");
		System.out.println("Stack1:" + stack1);
		Stack<Integer> stack2 = new Stack<Integer>();
		
		int r = (int) (Math.random()*100);
				
		for (int i = 0; i < r; i++) {
			int v = (int) (Math.random()*100);
			stack2.add(v);
		}
		
		System.out.println("Stack2: " + stack2);
		
		writeIntStackToFile(stack2, "files/writeStack.txt");
		
	}
	
	public static void writeIntStackToFile(Stack<Integer> stack, String path) {
		
		File f = new File(path);
		FileWriter fw;
		
		try {
			
			fw = new FileWriter(f);
			
		} catch (Exception e) {
			
			System.out.println("File not found");
			return;
			
		}
		
		PrintWriter pw = new PrintWriter(fw); 
		
		int size = stack.size();
		
		for (int i = 0; i < size; i++) {
			pw.println(stack.get(i));
		}
		
		pw.close();
		try {
			fw.close();
		} catch (IOException e) {
			System.out.println("we know");
		}
		
	}
	
	public static Stack<Integer> readToIntStack(String path) {
		
		Stack<Integer> out = new Stack<Integer>();
		
		File f = new File(path);
		Scanner s;
		try {
			s = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			return out;
		}
		
		while (s.hasNext()) {
			out.add(s.nextInt());
		}
		
		return out;
		
	}

}
