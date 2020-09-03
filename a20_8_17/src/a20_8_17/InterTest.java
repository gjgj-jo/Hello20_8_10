package a20_8_17;

public interface InterTest { //인터페이스는 선언만 해야한다. 멤버변수와 멤버메소드로 구성됨	NEW가 안돼
	public static final int red=1;	//멤버변수는 public static final 성질을 가짐
	int green=3;
	int blue=2;	//값을 뭐라도 넣어야한다.
	public void draw();		//멤버메소드는 public abstract 추상 메소드 성질을 가짐
}//추상성질이 있어서 선언만 해야한다.

//interface의 멤버변수는 final 성질이 있어서 값을 대입해야한다!! 반드시!!
