package a20_8_28_Inout;

import java.io.InputStream;
import java.io.OutputStream;
public class ByteTest {
	
	public static void main(String[] args) throws Exception {
		int data;
		
		//-1 ���� �����̴�
		InputStream input=System.in;
		OutputStream output=System.out;
		while((data=input.read())!=-1) {//read()����Ʈ���� �Է�
		output.write((char) data);
		}
		
	}

}
