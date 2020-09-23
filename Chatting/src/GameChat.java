import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class GameChat extends Applet implements ActionListener, Runnable {
	
	Socket mySocket=null;
	PrintWriter out=null;
	BufferedReader in=null;
		
	Thread clock;
	TextArea memo;
	TextField name;
	TextField input;
	Panel myPanel;


	public void init() {
		try {
			mySocket=new Socket("192.168.0.6", 2587); //서버의 ip, 포트번호를 통해 소켓 생성
			//소켓을 통한 출력스트림
			out=new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
			//소켓을 통한 입력스트림
			in=new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setLayout(new BorderLayout()); //배치 관리자로 보드레이아웃으로 설정 (동서남북 중앙)
		memo=new TextArea(10,55);	//네모나게 생긴것. memo라는 텍스트에리아
		this.add(BorderLayout.CENTER,memo); //추가(memo라는 텍스트에리아를 중앙에 배치)
		
		myPanel=new Panel(); //패널생성  (다른 컴포넌트를 얹일 수 있는)
		name=new TextField(8); //텍스트필드(8칸짜리)
		name.setText("대화명");	//name에 대화명이라는 글을 셋팅
		myPanel.add(name);		//패널에 name을 추가
		input=new TextField(40);	//텍스트필드 40칸 생성 input
		input.addActionListener(this);	//★ input이라는 곳에 액션리스너추가해둠
		myPanel.add(input);	//패널에 input 추가
		this.add(BorderLayout.SOUTH, myPanel);	//에플릿에 추가(패널)
	}

	public void start() {
		if(clock==null)
			clock=new Thread(this);
			clock.start(); //스레드의 run() 실행됨
	}

	public void stop() {
		if((clock!=null)&&(clock.isAlive())) {	//"LOGOUT|별명"을 출력스트림으로 프린트
			clock=null;
		}
		out.println("LOGOUT|"+name.getText());
		out.flush();
		
		try {
		out.close();
		in.close();
		mySocket.close();
	}	catch(Exception e) {
		memo.append(e.toString() +"\n");
	}
		}

	public void run() { //스레드에서 start()하면 실행됨
		out.println("LOGIN|"+mySocket);//"LOGIN|소켓" 출력스트림으로 프린트됨
		memo.append("[접속] "+getCodeBase().toString()+"\n");
		try {
			while(true) {	//무한루프
				String msg=in.readLine();	//소켓을 통해 입력받아서 msg에 저장
				if(!msg.equals("")&& !msg.equals(null)) {//저장받은것이 공백이 아니면(값이 있으면)
					memo.append(msg+"\n");		//msg 내용이 memo텍스트에리어에 추가됨
				}
			}
		} catch (Exception e) {
			memo.append(e.toString()+"\n");
		}
	}
	
public void actionPerformed(ActionEvent e) {//엔터를 치면 또 클릭하면 온다 ★여기서 e로전달된다
		if(e.getSource()==input) {
			String data=input.getText(); //input에 입력된 값을 data에 저장하라
			input.setText("");	//input은 공백으로 생성
			out.println("TALK|"+name.getText()+": "+data);
			//출력스트림으로 "TALK| 별명 : 안녕하세요" 트리트됨
			out.flush(); //출력스트림에 보내지지않은 것을 모두 비움
			
		}
	}

	
}
