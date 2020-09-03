package a20_8_17;

final class parentTest {	//상속해 줄수 없다.
	
}
public class finalTest {
final int x=1; //x=1로 정해졌으니 바꿀 수 없다.
final double IP=3.141592; //final 변수는 일반적으로 대문자를 사용

public final void show() {	//다음에는 show라는 것을 재정의 할 수 없다. 오버라이드X오버로딩X
	System.out.println(x);
}
	public static void main(String[] args) {
	
	}

}
