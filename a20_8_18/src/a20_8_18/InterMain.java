package a20_8_18;

public class InterMain {
	
	public static void call(Shape s, int x) {	//�θ���� �޾Ҵ�.
		if(s instanceof Circle)	{	//s��� ��ü�� circle ���� ��ü��??
			Circle c=(Circle) s; // s�� Circle Ÿ������ ���߾ �־��
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
		case 1: System.out.println("����"); break;
		case 3: System.out.println("�Ķ�"); break;
		case 2: System.out.println("���"); break;
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


