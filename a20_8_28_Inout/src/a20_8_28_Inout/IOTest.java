package a20_8_28_Inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest {

	public static void main(String[] args) throws Exception {//�𸣸�exception
		FileOutputStream fos=new FileOutputStream("sample.txt");//file ouputstream���̿���
		for(int i='A';i<='Z';i++) {
			fos.write(i); //write()�� ����Ʈ�������
		}
		fos.close();
		
	
	}

}
