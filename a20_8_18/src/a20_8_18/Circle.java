package a20_8_18;

public class Circle implements Shape {	//interface �ȿ� ������ �Ǿ� �־

	
	private int r;
	private double res;
	
	public Circle() {
		
	} //����Ʈ ������
	
	public Circle(int r) {
		this.r=r;
	}
	public void area() {
		res=r*r*Math.PI;

	}

	public void show() {
		System.out.println("������="+res);
	}

}
