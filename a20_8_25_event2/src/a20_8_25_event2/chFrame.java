package a20_8_25_event2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class chFrame extends Frame implements WindowListener{	//���� �ڽ� ������
					 
						
					
	
	public chFrame() {	//����Ʈ ������
		this.setVisible(true);
		this.setTitle("�����ѻѳ���");
		this.setBounds(10, 10, 300, 500);
		this.addWindowListener(this);	//�������̺�Ʈ���⸦ ���
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
	public void windowClosing(WindowEvent arg0) {//������ݱ��ư
		// TODO Auto-generated method stub
		System.exit(0); //����
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
