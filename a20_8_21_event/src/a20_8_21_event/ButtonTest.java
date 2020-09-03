package a20_8_21_event;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonTest extends Applet implements ActionListener{//Applet의 자식이됨
	Button btn1, btn2, btn3;	//버튼에는 ActionListener 인터페이스를 상속받아야됨
	TextArea ta;
	public void init() {
		this.setLayout(null); //Layout은 배치관리자. null로 세팅한다
		btn1=new Button("java");
		btn2=new Button("jsp");
		btn3=new Button("연습");
		
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
		
		btn1.addActionListener(this);//btn1버튼(컴포넌트)에 액션추가
		btn2.addActionListener(this);//btn2버튼에 액션추가
		btn3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) { //btn2번이면 e로 들어간다
		if(e.getSource()==btn1) {// 건드린 그 컴포넌트가 btn1이냐?
			btn1.disable();
			ta.append("자바\n");
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
