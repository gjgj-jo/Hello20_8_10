package a20_9_21_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientText {

	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("192.168.0.6",9000); //9000번이라는 포트번호
		//입력스트림
		BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//출력스트림
		PrintWriter output=new PrintWriter(socket.getOutputStream());
		
		output.println(""); //클라이언트에서 서버님 안녕하세요 하고 말검
		output.flush();
		
		String str=input.readLine();
		System.out.println(str);
	}

}
