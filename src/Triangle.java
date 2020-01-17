import java.util.Arrays;
import java.util.HashMap;

public class Triangle {

	private float a = 1;
	private float b = 1;
	private float c = 1;
	
	private float x;
	private float y;
	
	
	
	
	public Triangle(float[] sides) {
		a = sides[0];
		b = sides[1];
		c = sides[2];
	}
	
	public Triangle() {};
	
	
	
	
	
	public HashMap<String, Float> getAngles() {
		
		HashMap<String, Float> out = new HashMap<String, Float>();
		
		out.put("a", (float) Math.acos((square(b) + square(c) - square(a))/(2*b*c)));
		out.put("b", (float) Math.acos((square(a) + square(c) - square(b))/(2*a*c)));
		out.put("c", (float) Math.acos((square(b) + square(a) - square(c))/(2*a*b)));
		
		return out;
		
	}
	
	
	public float getArea() {
		
		float s = 0.5f * (a+b+c);
		return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
	}
	
	public float getPer() {
		return a+b+c;
	}
	
	
	public float square(float f) {
		return (float) Math.pow(f, 2);
	}


	public float getA() {
		return a;
	}


	public void setA(float a) {
		if (a > 0)
			this.a = a;
	}


	public float getB() {
		return b;
	}


	public void setB(float b) {
		if (b > 0)
			this.b = b;
	}


	public float getC() {
		return c;
	}


	public void setC(float c) {
		if (c > 0)
			this.c = c;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
}
