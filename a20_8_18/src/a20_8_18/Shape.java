package a20_8_18;

public interface Shape {
	int RED=1;
	public static final int GREEN=1; //public static final 성질있음
	public static final int BLUE=3;
	public void area();//선언만 함  메소드 public abstract 추상메소드 성격있음
	public void show();		//추상이기 때문에 선언만 하고 정의는 안함
}
