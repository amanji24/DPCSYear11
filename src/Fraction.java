
// A class is a blueprint, an object is an instance of the class

public class Fraction {

	
	// Attributes/Fields:
	// Suggestion: never use the same variable name that a field is in your class
	
	private int num;
	private int den;
	
	private static int fractionCount = 0;
	
	
	// Constructors:
	
	public Fraction(int n, int d) {
		
		this.num = n;
		this.den = d;
		
		if (this.den == 0) {
			this.den = 1;
		}
		
		fractionCount++;
		
	}
	
	public Fraction() {
		
		this.num = 1;
		this.den = 1;
		
		fractionCount++;
		
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
	
	public void multiply(Fraction f) {
		
		this.num *= f.getNum();
		this.den *= f.getDen();
		reduce();
		
	}
	
	
	public void divide(Fraction f) {
		this.multiply(f.makeReciprocal());
	}
	
	public Fraction makeReciprocal() {
		return new Fraction(this.den, this.num);
	}
	
	public double getDecimal() {
		return 1.0*this.num/this.den;
	}
	
	
	
	// Setters & Getters:
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		if (den != 0) {
			this.den = den;
		} else {
			System.out.println("Denominator cannot be set to 0.");
		}
	}

	public static int getFractionCount() {
		return fractionCount;
	}

	public static void setFractionCount(int fractionCount) {
		Fraction.fractionCount = fractionCount;
	}
	
	
	

}
