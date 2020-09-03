package a20_8_28_Inout;

import java.io.InputStream;
import java.io.OutputStream;
public class ByteTest {
	
	public static void main(String[] args) throws Exception {
		int data;
		
		//-1 값을 에러이다
		InputStream input=System.in;
		OutputStream output=System.out;
		while((data=input.read())!=-1) {//read()바이트단위 입력
		output.write((char) data);
		}
		
	}

}
