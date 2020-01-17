package klas;

public class Fraction {

	
	// Atributes/Fields:
	// Suggestion: never use the same variable name that a field is in your class
	
	int num;
	int den;
	
	
	
	// Constructors:
	
	public Fraction(int num, int den) {
		
		this.num = num;
		this.den = den;
		
	}
	
	public Fraction() {
		
		this.num = 1;
		this.den = 1;
		
	}
	
	
	
	// Behaviors:
	
		public void reduce() {
					
			int max;
			
			if (this.num > this.den) {
				max = this.den;
			} else {
				max = this.num;
			}
			
			while (true) {
				
				int factor = 1;
				
				for (int i = max; i > 1; i--) {
					
					if (this.num % i == 0 && this.den % i == 0) {
						factor = i;
						break;
					}
					
				}
				
				if (factor == 1) {
					break;
				}
				
				this.num /= factor;
				this.den /= factor;
				
			}
			
		}
	
}
