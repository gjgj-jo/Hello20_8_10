package a20_9_21_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerText {
	
	public static void main(String[] args) throws Exception {
		
		ServerSocket ss=new ServerSocket(9000);
		Socket socket=ss.accept();
		
		//입력스트림(입력도로)
		BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//출력스트림
		PrintWriter output=new PrintWriter(socket.getOutputStream());
		//버퍼까지 준비된 출력스트림
		
		String str=input.readLine();
		System.out.println(str);
		
		output.println("hello");
		output.flush(); //메모리를 보내라
		
		socket.close();
		ss.close(); //소켓 문닫아
	}
	}
