import java.net.ServerSocket;
import java.util.Vector;

public class ChatServer
{
	Vector clientVector=new Vector();
	int clientNum=0;
	
	public void broadcast(String msg) throws Exception
	{
		synchronized(clientVector) {
			for(int i=0;i<clientVector.size();i++) {
				ChatThread client= (ChatThread) clientVector.elementAt(i);
				synchronized(client) {
					client.sendMessage(msg);
				}
			}
		}
	}
	
	public void removeClient(ChatThread client) {
		synchronized(clientVector) {
			clientVector.removeElement(client);
			client=null;
			System.gc();
		}
	}
	
	public void addClient(ChatThread client)		//내 자신한테 있는 클라이언트
	{
		synchronized(clientVector) {
			clientVector.addElement(client);
		}
	}
	public static void main(String[] args) {
		ServerSocket myServerSocket=null;			//내 스스로가 new
		ChatServer myServer=new ChatServer();// 1)현재 chatserver자체 생성-->myserver객체명으로 사용
			
		try {
			myServerSocket=new ServerSocket(2587);	//포트번호 열었음
													//2) serversockeet(2587)로 생성하여
													// -->myserversocket객체명으로 사용
		} catch(Exception e) {
			System.out.println(e.toString());
			System.exit(-1);
		}
		System.out.println("[서버 대기 상태] "+ myServerSocket);
		//3)콘솔에 [서버대기상태] ServerSocket[addr=0.0.0/0.0.0.0.port=0.localport=2587]
//---------------------------------------------------------------핵심파트	
		try {
			while(true) {	//서버는 무한루프 돌기
				ChatThread client=new ChatThread(myServer, myServerSocket.accept());//★
				//accept는 들어와주길 기다린다 (100 명이 들어오건 계속 들어와야하니까)
				//(서버,소켓)를 생성하여 -->client 객체명
				client.start();		//서버는 run()으로 실행하고, 클라이언트가 접속시 아래쪽 명령수행
									//ChatThread클래스의 run()메소드 실행함
				myServer.addClient(client);	//내 자신의 addClient 메소드 실행★
				
				myServer.clientNum++;	//내 자신의 클라이언트 넘버를 1씩 증가★
				System.out.println("[현재 접속자수]"+myServer.clientNum+"명");
			}
		}catch(Exception e) {
			System.out.println(e.toString());
			}
		}
	}


