package a20_8_20_awt;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_test extends Applet 
                    implements ActionListener {
	
	Button btn1, btn2, btn3;	//버튼들은 ActionListener
	public void init() {
		btn1=new Button();
		btn2=new Button("C++");
		btn3=new Button("java");
		
		btn1.setLabel("C");
		btn2.setLabel("Cpp");
		
		btn1.setBackground(Color.YELLOW);
		btn2.setBackground(new Color(255,255,0));
		btn3.setBackground(new Color(0,0,255));
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		btn1.addActionListener(this);
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼1");
		
	}
}