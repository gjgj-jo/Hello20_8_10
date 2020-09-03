package a20_8_28_Inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOTest2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("sample.txt");
		int data;
		while((data=fis.read())!=-1) {	//-1이아니면=에러가 없으면
			System.out.print((char) data);
		}
		fis.close();
	}

}
