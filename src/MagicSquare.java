import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {

		System.out.println(isSquare());
		
	}
	
	public static String isSquare() {
		Scanner s = new Scanner(System.in);
		int[][] rows = { {16,3,2,13}, {5,10,11,8}, {9,6,7,12}, {4,15,14,1} };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				rows[i][j] = s.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < rows.length; i++) {
			int rowSum = 0;
			for (int i2 = 0; i2 < rows[i].length; i2++) {
				rowSum += rows[i][i2];
			}
			if (sum == 0) {
				sum = rowSum;
			}
			if (rowSum != sum) {
				return "not magic";
			}
		}
		for (int i = 0; i < rows.length; i++) {
			int colSum = 0;
			for (int i2 = 0; i2 < rows[i].length; i2++) {
				colSum += rows[i2][i];
			}
			if (colSum != sum) {
				return "not magic";
			}
		}
		return "magic";
	}

}
