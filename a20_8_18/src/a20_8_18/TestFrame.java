package a20_8_18;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame {
	
	JLabel lbl;
	JButton btn=null;
	static TestFrame frame;
	public static void main(String[] args) {		
		frame=new TestFrame();	//���� �� �ڽ��� new �Ѵ�.
		
	

	}
		public TestFrame() {
		this.setVisible(true);
		this.setBounds(10, 10, 500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//btn=new JButton("����");
		//lbl=new JLabel("�̸�");
		txt=new JTextField();
		this.add(lbl);
		this.add(btn);
		this.add(txt);
		}
}
