package a20_8_28_Inout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOTest2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("sample.txt");
		int data;
		while((data=fis.read())!=-1) {	//-1�̾ƴϸ�=������ ������
			System.out.print((char) data);
		}
		fis.close();
	}

}
