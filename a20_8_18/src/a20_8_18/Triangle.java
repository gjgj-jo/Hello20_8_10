package a20_8_18;

public class Triangle implements Shape {
	
	int w,h;
	double res;
	
	public Triangle() { }
	public Triangle(int w, int h) {
		this.w=w;
		this.h=h;
	}

	public void area() {

	res=(w*h)/2.0;
	}


	public void show() {
		System.out.println("»ï°¢ÇüÀÇ³ĞÀÌ="+res);

	}

}
