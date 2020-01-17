import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Outliers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> outliers = new ArrayList<Integer>();
		ArrayList<Integer> raw = new ArrayList<Integer>();
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		boolean moreInput = true;
		
		while (moreInput) {
			String inStr = s.nextLine();
			if (inStr.equals("*")) {
				moreInput = false;
			} else {
				int inNum = Integer.parseInt(inStr);
				raw.add(inNum);
			}
		}
				
		for (int i = 0; i < raw.size(); i++) {
						
			int el = raw.get(i);
			
			if (i == 0) {
				data.add(el);
			} else {
				boolean placed = false;
				for (int j = 0; j < data.size(); j++) {
					if (el < data.get(j) && !placed) {
						data.add(j, el);
						placed = true;
					}
				}
				if (!placed) {
					data.add(el);
				}
				
			}
			
		}
		
		//Calculation
		
		int dSize = data.size();
		boolean evenSize = (dSize % 2 == 0); 
		float median = 0;
		float q1 = 0;
		float q3 = 0;
		float IQR = 0;
		float min = (float) data.get(0);
		float max = (float) data.get(dSize-1);
		
		if (evenSize) {
			median = (data.get(dSize/2) + data.get(dSize/2-1))/2f;
		} else {
			median = data.get(dSize/2);
		}
		
		List<Integer> half1;
		List<Integer> half2;
		
		if (evenSize) {
			half1 = data.subList(0, dSize/2);
			half2 = data.subList(dSize/2, dSize);
		} else {
			half1 = data.subList(0, dSize/2);
			half2 = data.subList(dSize/2+1, dSize);
		}
		
		int h1Size = data.size();
		boolean h1even = (h1Size % 2 == 0);
		
		if (h1even) {
			q1 = (half1.get(h1Size/2) + half1.get(h1Size/2-1))/2f;
		} else {
			q1 = half1.get(h1Size/2);
		}
		
		int h2Size = data.size();
		boolean h2even = (h2Size % 2 == 0);
		
		if (h1even) {
			q3 = (half2.get(h2Size/2) + half2.get(h2Size/2-1))/2f;
		} else {
			q3 = half2.get(h2Size/2);
		}
		
		IQR = q3 - q1;
		
		float lowerBound = (float) (q1 - (IQR*1.5));
		float higherBound = (float) (q3 + (IQR*1.5));
		
		for (int i = 0; i < data.size(); i++) {
			int el = data.get(i);
			if (el < lowerBound || el > higherBound) {
				outliers.add(el);
			}
		}
		
		System.out.println(outliers);
		
	}
	
}
