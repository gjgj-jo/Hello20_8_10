
public class Circle extends Shape {

	private int r;
	public void draw() {
	}
	public void area() {
		res=r*r*Math.PI;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void show() {
		System.out.println("¿ø³ÐÀÌ="+res);
	}
}
