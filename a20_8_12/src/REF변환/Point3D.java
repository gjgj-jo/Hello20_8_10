package REFº¯È¯;

public class Point3D extends Point {
	private int z;
	public void show() {
		super.show();	//ºÎ¸ð´ÔÇÑÅ× °¡¼­
		System.out.println("z="+z);	//³»²¨Âï°í
	}
	public Point3D() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point3D(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public Point3D(int z) {
		super();
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
}
