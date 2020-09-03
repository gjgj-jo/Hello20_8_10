package a20_8_25_event2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class chFrame extends Frame implements WindowListener{	//나는 자식 프레임
					 
						
					
	
	public chFrame() {	//디폴트 생성자
		this.setVisible(true);
		this.setTitle("위대한뿌끼니");
		this.setBounds(10, 10, 300, 500);
		this.addWindowListener(this);	//윈도우이벤트오기를 대기
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {//윈도우닫기버튼
		// TODO Auto-generated method stub
		System.exit(0); //꺼짐
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
