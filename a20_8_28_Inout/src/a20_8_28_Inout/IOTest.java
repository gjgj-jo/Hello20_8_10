package a20_8_28_Inout;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest {

	public static void main(String[] args) throws Exception {//모르면exception
		FileOutputStream fos=new FileOutputStream("sample.txt");//file ouputstream용이에요
		for(int i='A';i<='Z';i++) {
			fos.write(i); //write()란 바이트단위출력
		}
		fos.close();
		
	
	}

}
