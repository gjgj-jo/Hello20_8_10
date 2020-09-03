package a20_8_25_event2;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class mouseTest extends Applet implements MouseListener {

	JLabel lbl1;
	int num; //ī���� 1������
	int x[]; //x���� �����ϱ� ���� x�迭
	int y[]; //y���� �����ϱ� ���� y�迭
	
	public void init() {
		this.setLayout(null);
		lbl1=new JLabel("���콺�� Ŭ���ϸ� ���� �׷����ϴ�");
		lbl1.setBounds(10,20,300,20);
		this.add(lbl1);
		
		num=0;
		x=new int[100];	//x�迭�� �� 100��
		y=new int[100];
		
		this.addMouseListener(this);	//���콺Ŭ���Ҷ�������ٸ�
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		for(int i=0;i<num;i++) {
			g.fillOval(x[i]-20, y[i]-10, 20, 20);
		}
		
	}
	

	
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("���콺�� Ŭ���ϼ̱���");
		System.out.println("x��="+arg0.getX());	//x�������� �˼�����
		System.out.println("y��="+arg0.getY());
		
		if(num<100) {
			x[num]=arg0.getX();
			y[num]=arg0.getY();
			num++;
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
