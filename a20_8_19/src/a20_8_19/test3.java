package a20_8_19;

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;

public class test3 extends Applet {
	
	Label lbl1, lbl2;
	TextField txt1,txt2;
	public void init() {
		lbl1=new Label("name");
		lbl2=new Label("id");
		txt1=new TextField();
		txt2=new TextField();
		
		this.add(lbl1); //���̺� (name)
		this.add(lbl2);	//�ؽ�Ʈ�ʵ�
		this.add(txt1);
		this.add(txt2);	
		txt1.setText("ȫ�浿");
		txt2.setText("hong");
	}
	public void start() {
		txt1.setText("");
		txt2.setText("");
	}
}
