import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GameChat2 implements ActionListener { //1)ActionListener를 상속받는다
													//2)빨간단추 열어서 추가한다.
	private JFrame frame;
	private JTextField name;
	private JTextField input;
	private JTextArea memo; 

	Socket mySocket=null;
	PrintWriter out=null;
	BufferedReader in=null;

	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameChat2 window = new GameChat2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameChat2() {
		initialize(); //디자이너
		init();
	}
	public void init() {
		try {
			mySocket=new Socket("192.168.0.6", 2587); //서버의 ip, 포트번호를 통해 소켓 생성
			out=new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
			in=new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			
			out.println("LOGIN|"+ mySocket); //(1)
			memo.append("[접속] \n");
		} catch (Exception e) {	
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("채팅하자");
		frame.setBounds(100, 100, 655, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		name = new JTextField();
		name.setBounds(79, 341, 125, 21);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		input = new JTextField();
		input.setBounds(216, 341, 411, 21);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(22, 344, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		input.addActionListener(this);
				
		memo = new JTextArea();
		memo.setBackground(Color.ORANGE);
		memo.setBounds(12, 10, 615, 305);
		frame.getContentPane().add(memo);
		memo.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==input) {
			String str="TALK|"+name.getText()+": "+input.getText();
			System.out.println(str);
			input.setText("");
		}
		
	}
}
