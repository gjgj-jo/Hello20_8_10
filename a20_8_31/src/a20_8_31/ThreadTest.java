package a20_8_31;


class mythread extends Thread { //thread로부터 상속받은 나는 thread의 자식
	
	int num=0;
	String name;
	public mythread() {} //디폴트 생성자
	public mythread(String name) {
		this.name=name;
	}
	public void run() {
		while(true) {	//무한루프
			System.out.println(name+"="+num);
			num++;
			try {	//try 안에 명령문 넣음
				sleep(1000);//1초동안 쉬는시간
			} catch (InterruptedException e) {
				e.printStackTrace(); //에러추적
			} 
		}
	}
}
public class ThreadTest {		

	public static void main(String[] args) {
		mythread kim=new mythread("김길동");
		kim.start();	//세 사람이 다중스레드
		
		mythread lee=new mythread("이순자");
		lee.start();
		
		mythread park=new mythread("박말자");
		park.setPriority(Thread.MAX_PRIORITY);//될수있으면 우선순위 더 준다
		park.start();
	}

}
