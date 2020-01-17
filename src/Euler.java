import java.util.ArrayList;

public class Euler {

	static boolean exceed = false;
	
	public static void main(String[] args) {

		function();
		System.out.println(total);
		
	}
	
	static int total = 0;
		
	public static void function() {
		
		for (long l = 1; l < 1000000000; l++) {
			if (isR(l)) {
				total++;
			}
		}
		
	}
	
	public static boolean isR(long l) {
		while (l % 10 == 0) {
			l /= 10;
		}
		if (l % 2 == 0) {
			if (getFirst(l) % 2 != 0) {
				return false;
			}
			return true;
		}
		if (getFirst(l) % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public static int getFirst(long l) {
		String str = ""+l;
		return Integer.parseInt(str.substring(0,1));
	}

}
