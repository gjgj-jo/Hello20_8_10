import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

public class ChatThread extends Thread{
	ChatServer myServer;
	Socket mySocket;
	
	PrintWriter out;
	BufferedReader in;
	
	public ChatThread(ChatServer server, Socket socket)
	{
		super("ChatThread");
		
		myServer= server;		//전달받은 것을 가지고 있다.
		mySocket= socket;
		
		out=null;
		in=null;
	}
	public void sendMessage(String msg) throws Exception
	{
		out.println(msg);
		out.flush();
	}
	
	public void disconnect()
	{
		try {
			out.flush();
			in.close();
			out.close();
			mySocket.close();
			myServer.removeClient(this);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void run()
	{
		try {
			out=new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));
			in=new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			
			while(true) {
				String inLine=in.readLine();
				if(!inLine.equals("") && !inLine.equals(null)) {
					messageProcess(inLine);
				}
			}
		} catch(Exception e) {
			disconnect();
		}
	}
	public void messageProcess(String msg)
	{
		System.out.println(msg); //클라이언트가 보냄

		StringTokenizer st=new StringTokenizer(msg,"|");
		String command=st.nextToken();
		String talk=st.nextToken();
		
		if(command.equals("LOGIN")) {
			System.out.println("[접속]"+ mySocket);
			try {
				myServer.broadcast("[현재 접속자수] "+ myServer.clientNum+"명");
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		} else if(command.equals("LOGOUT")) {
			try {
				myServer.clientNum--;
				myServer.broadcast("[접속 종료] "+ talk);
				myServer.broadcast("[현재 접속자수]" + myServer.clientNum +"명");
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			disconnect();
		} else {
			try {
				myServer.broadcast(talk);
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
