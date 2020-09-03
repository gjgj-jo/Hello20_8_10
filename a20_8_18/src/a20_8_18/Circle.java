package a20_8_18;

public class Circle implements Shape {	//interface 안에 선언이 되어 있어서

	
	private int r;
	private double res;
	
	public Circle() {
		
	} //디폴트 생성자
	
	public Circle(int r) {
		this.r=r;
	}
	public void area() {
		res=r*r*Math.PI;

	}

	public void show() {
		System.out.println("원넓이="+res);
	}

}
