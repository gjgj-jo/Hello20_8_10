package a20_8_19;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class test1 extends Applet {

	
	
	
	
	@Override
	public void paint(Graphics g) {//applet�� ��ӹ޾Ƽ� �ϰ�����.
		//paint�� �׷��� ��� �� graphics 'g'�� �����̶�� ��
		Color c=new Color(255,0,0);//color�� ���� �ɷ��� x �׷��� new�Ἥ ��� 
        //R G B ���Ͼ��
		Font f=new Font("�ü�ü",Font.BOLD, 15);
		g.setColor(c); //����(g)�� ������ ���� c�� �ִ´� (set�� �ִ´�)
		g.setFont(f);
		g.drawString("���ѹα�", 100, 100);
		
		
		Font f2=new Font("�޸ո���ü", Font.BOLD+Font.ITALIC,18);
		Color c2=Color.pink; // �� ������ �޸� �̷������ �ִٴ°� ������.new ���ϰ� �ٷξ�������
		g.setColor(c2);
		g.drawString("���ø�����", 100, 200);
	
		
	
	}

	public void destroy() {
		System.out.println("����");
	}

	public void init() {	//ó��
		System.out.println("�ʱ�");
		
	}

	public void start() {
		System.out.println("����");
		
	}

	public void stop() {
		System.out.println("����");
	
	}
	
}
