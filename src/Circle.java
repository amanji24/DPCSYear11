
public class Circle {

	private float rad = 1;
	private float x;
	private float y;
	private final float PI = (float) Math.PI;
	
	
	public Circle() {}
	
	public Circle(float r) {
		this.setRad(r);
	}
	
	public Circle(float r, float x, float y) {
		this.setRad(r);
		this.setX(x);
		this.setY(y);
	}
	
	public float getDi() {
		return rad*2f;
	}
	
	public float getCir() {
		return (float) (2f*rad*PI);
	}
	
	public float getArea() {
		return (float) (Math.pow(rad, 2) * PI);
	}
	

	public void shrink(int multiple) {
		this.rad /= multiple;
	}
	
	public void grow(int multiple) {
		this.rad *= multiple;
	}
	
	

	public float getRad() {
		return rad;
	}

	public void setRad(float rad) {
		if (rad >= 0) {
			this.rad = rad;
		} else {
			System.out.println("Can't have a negative radius");
		}
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
