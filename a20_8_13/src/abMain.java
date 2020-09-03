
public class abMain {
	public static void main(String[] args) {
		//Shape a=new Shape(); //X 추상클래스라서 new 안대
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		
		new call(c);
		new call(r);
		new call(t);
		
		/*c.setR(10);			//부모에게 맡기면 setR안댐
		c.area();
		c.show();
		
		r.setW(5);
		r.setH(6);
		r.area();
		r.show();
		
		t.setW(5);
		t.setH(6);
		t.area();
		t.show();*/
	}
	}

