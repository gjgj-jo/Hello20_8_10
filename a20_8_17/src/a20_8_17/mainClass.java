package a20_8_17;
//인터페이스란 : 클래스와 동일하게 멤버변수와 멤버메소드로 구성된 구조이다. (양부모,알려주지않음)

//자바는 단일상속만 가능하다. 이런 단점을 보완하기 위해서 인터페이스가 나왔다.
//인터페이스 자식클래스에게 상속해주는 역할만 한다.
//스스로는 new로 생성되지 않는다.

//인터페이스
//-멤버변수 public static final 성격가짐
//-멤버메소드는 public abstract 성격가짐. 즉, 선언만 가능하고 자식이 오버라이딩하여 사용하여야 한다.

//class A {}
//class B {}
//class C extends A,B { } (X) extends 뒤에는 친부모 1개만
//class D extends B {  } (0}

//interface X {}
//class Y extends X { } (X) 문법에러
//class Y implements X {  } (0)


//class Z extends A implements X (0) 
class childTest implements InterTest{	//interface는 implements로 상속받습니다. 자식이 구현함

	@Override
	public void draw() {
		//interface에서 상속받았기 때문에 (implements) 구현정의를 해아한다.
		//자식이 오벌라이딩 해서 정의해야한다.
	}		
	
}
public class mainClass {

	public static void main(String[] args) {
		//new interface
	}

}
