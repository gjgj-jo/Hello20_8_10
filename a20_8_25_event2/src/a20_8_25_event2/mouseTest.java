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
	int num; //카운팅 1씩증가
	int x[]; //x축을 저장하기 위한 x배열
	int y[]; //y축을 저장하기 위한 y배열
	
	public void init() {
		this.setLayout(null);
		lbl1=new JLabel("마우스를 클릭하면 원이 그려집니다");
		lbl1.setBounds(10,20,300,20);
		this.add(lbl1);
		
		num=0;
		x=new int[100];	//x배열에 방 100개
		y=new int[100];
		
		this.addMouseListener(this);	//마우스클릭할때까지기다림
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		for(int i=0;i<num;i++) {
			g.fillOval(x[i]-20, y[i]-10, 20, 20);
		}
		
	}
	

	
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("마우스를 클릭하셨군요");
		System.out.println("x축="+arg0.getX());	//x축정보를 알수있음
		System.out.println("y축="+arg0.getY());
		
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
