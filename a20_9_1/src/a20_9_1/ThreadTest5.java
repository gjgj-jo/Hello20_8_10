package a20_9_1;

import java.awt.EventQueue;

class mythread5 extends Thread {
			int num=0;
			String name;
			public mythread5(String name) {
				this.name=name;
			}
			public void run() {
				while(true) {
					System.out.println(name+":"+(++num));
					//sleep(1000);
				}
			}
	}
	public class ThreadTest5 {
	public static void main(String[] args) {
		mythread5 my5=new mythread5("�达");
		mythread5 my6=new mythread5("�̾�");
		EventQueue.invokeLater(my5);	//���α׷� �ϳ��� �ϳ��� ����¸���. �ι�����
		EventQueue.invokeLater(my6);	
		my5.start();
		my6.start();
	}

}
