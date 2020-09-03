package a20_8_18;

public class Rectangle implements Shape {
	
	int w,h;
	double res;
	
	public Rectangle() { }
	public Rectangle(int w, int h) {
		this.w=w;
		this.h=h;
	}
	public void area() {
		res=w*h;

	}

	
	public void show() {
		System.out.println("사각형의넓이="+res);

	}

}
