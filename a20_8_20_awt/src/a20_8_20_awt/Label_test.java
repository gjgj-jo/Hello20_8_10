package a20_8_20_awt;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;

public class Label_test extends Applet {

	Label lbl1,lbl2,lbl3;
	public void init() {
		lbl1=new Label("C¾ð¾î");
		lbl2=new Label();
		lbl3=new Label("jsp", Label.RIGHT);
		
		lbl2.setText("java");
		lbl1.setBackground(Color.BLUE);
		lbl2.setBackground(new Color(255,0,0));
		lbl3.setBackground(Color.cyan);
		
		lbl1.setAlignment(Label.CENTER);
		lbl2.setAlignment(Label.CENTER);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
	
	}

	public void start() {
		// TODO Auto-generated method stub
	
	}

	
	
}
