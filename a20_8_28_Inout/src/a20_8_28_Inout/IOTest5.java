package a20_8_28_Inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOTest5 {
//iotest4.txt 파일에서 읽어오라
	public static void main(String[] args) throws Exception {
		File file=new File("iotest4.txt");
		FileReader input=new FileReader(file);
		int data;
		while((data=input.read())!=-1) {
			System.out.println((char) data);
		}
	}

}
