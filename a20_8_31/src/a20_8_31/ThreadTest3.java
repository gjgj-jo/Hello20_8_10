package a20_8_31;
//다중스레드
class mythread3 implements Runnable {
	//Runnable로부터 상속받은 mythread3
	//run을 구현하기 위한 인터페이스일 뿐. 스레드는 아님
									
	
	int num=0;
	String name;
	public mythread3(String name) {
		this.name=name;
	}
	public void run() {
		while(true) {
			System.out.println(name+"="+num);
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //1초단위 쉬어줌
		}
	}
}
public class ThreadTest3 {

	public static void main(String[] args) {
		mythread3 kim=new mythread3("김길동");
		Thread th=new Thread(kim);
		th.start();
		
		mythread3 lee=new mythread3("이순자");
		Thread th2=new Thread(lee);
		th2.start();
		
		mythread3 park=new mythread3("박말자");
		Thread th3=new Thread(park);
		th3.start();
		
		
		

	}

}
