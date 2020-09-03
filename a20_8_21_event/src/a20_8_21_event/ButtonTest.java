package a20_8_21_event;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonTest extends Applet implements ActionListener{//Applet�� �ڽ��̵�
	Button btn1, btn2, btn3;	//��ư���� ActionListener �������̽��� ��ӹ޾ƾߵ�
	TextArea ta;
	public void init() {
		this.setLayout(null); //Layout�� ��ġ������. null�� �����Ѵ�
		btn1=new Button("java");
		btn2=new Button("jsp");
		btn3=new Button("����");
		
		btn1.setBounds(2, 10, 50, 50);
		btn2.setBounds(100, 10, 50, 50);
		btn3.setBounds(200, 10, 50, 50);
		
		ta=new TextArea(5, 10);
		ta.setBackground(Color.yellow);
		ta.setBounds(2, 100, 200, 100);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(ta);
		
		btn1.addActionListener(this);//btn1��ư(������Ʈ)�� �׼��߰�
		btn2.addActionListener(this);//btn2��ư�� �׼��߰�
		btn3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) { //btn2���̸� e�� ����
		if(e.getSource()==btn1) {// �ǵ帰 �� ������Ʈ�� btn1�̳�?
			btn1.disable();
			ta.append("�ڹ�\n");
			ta.append(btn1.getLabel()+"\n");
			btn2.enable();
			btn3.enable();
		}
		else if(e.getSource()==btn2) {
			ta.append(btn2.getLabel()+"\n");
		}
		else if(e.getSource()==btn3) {
			ta.append(btn3.getLabel()+"\n");
		}
	}
	
	
}
