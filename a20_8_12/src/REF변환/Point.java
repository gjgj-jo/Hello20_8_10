package REF��ȯ;

public class Point {
	protected int x,y;
	public void show() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	public Point() {
		super();
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
}
