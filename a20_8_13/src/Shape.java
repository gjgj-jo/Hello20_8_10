
public abstract class Shape {
	protected double res;
	public void show() {
		System.out.println(res);
	}
	public abstract void area(); //추상메소드
	public abstract void draw();//추상메소드는 선언만 한다. 왜요? 자식이 정의한다.
		
	}

