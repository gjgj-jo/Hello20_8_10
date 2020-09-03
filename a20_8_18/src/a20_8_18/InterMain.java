package a20_8_18;

public class InterMain {
	
	public static void call(Shape s, int x) {	//부모님이 받았다.
		if(s instanceof Circle)	{	//s라는 객체가 circle 형의 객체냐??
			Circle c=(Circle) s; // s를 Circle 타입으로 맞추어서 넣어라
			c.area();
			c.show();
			
		} else if(s instanceof Rectangle) {
			Rectangle r=(Rectangle) s;
			r.area();
			r.show();
			
		} else if(s instanceof Triangle) {
			Triangle t=(Triangle) s;
			t.area();
			t.show();
		}
		switch(x) {
		case 1: System.out.println("빨강"); break;
		case 3: System.out.println("파랑"); break;
		case 2: System.out.println("녹색"); break;
		}
	}
	public static void main(String[] args) {
		Circle c=new Circle(5);
		call(c, Shape.RED);
	
		Rectangle r=new Rectangle(5,6);
		call(r, Shape.BLUE);
		
		Triangle t=new Triangle(5,6);
		call(t, Shape.GREEN);
			
		}
	}


