package a20_8_31;


class mythread extends Thread { //thread�κ��� ��ӹ��� ���� thread�� �ڽ�
	
	int num=0;
	String name;
	public mythread() {} //����Ʈ ������
	public mythread(String name) {
		this.name=name;
	}
	public void run() {
		while(true) {	//���ѷ���
			System.out.println(name+"="+num);
			num++;
			try {	//try �ȿ� ��ɹ� ����
				sleep(1000);//1�ʵ��� ���½ð�
			} catch (InterruptedException e) {
				e.printStackTrace(); //��������
			} 
		}
	}
}
public class ThreadTest {		

	public static void main(String[] args) {
		mythread kim=new mythread("��浿");
		kim.start();	//�� ����� ���߽�����
		
		mythread lee=new mythread("�̼���");
		lee.start();
		
		mythread park=new mythread("�ڸ���");
		park.setPriority(Thread.MAX_PRIORITY);//�ɼ������� �켱���� �� �ش�
		park.start();
	}

}
