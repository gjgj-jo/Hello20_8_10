package a20_8_11;

import javax.swing.JFrame;

public class testFrame {

	public static void main(String[] args) {
		JFrame frame=new JFrame("프레임연습");
		frame.setVisible(true);		//객체명을 frame이라해서
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창끌수있도록
		frame.setBounds(10, 10, 300, 300);
	}

}
