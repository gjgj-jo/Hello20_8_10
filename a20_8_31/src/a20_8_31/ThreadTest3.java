package a20_8_31;
//���߽�����
class mythread3 implements Runnable {
	//Runnable�κ��� ��ӹ��� mythread3
	//run�� �����ϱ� ���� �������̽��� ��. ������� �ƴ�
									
	
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
			} //1�ʴ��� ������
		}
	}
}
public class ThreadTest3 {

	public static void main(String[] args) {
		mythread3 kim=new mythread3("��浿");
		Thread th=new Thread(kim);
		th.start();
		
		mythread3 lee=new mythread3("�̼���");
		Thread th2=new Thread(lee);
		th2.start();
		
		mythread3 park=new mythread3("�ڸ���");
		Thread th3=new Thread(park);
		th3.start();
		
		
		

	}

}
