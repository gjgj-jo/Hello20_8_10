package a20_8_28_Inout;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//iotest.6txt읽어와서 화면에 출력해봐라
public class IOTest7 {

	public static void main(String[] args) throws Exception {
		File file=new File("iotest6.txt");
		FileInputStream fis=new FileInputStream(file);
		DataInputStream input=new DataInputStream(fis);
		String name=input.readUTF();
		int kor=input.readInt();
		int eng=input.readInt();
		int mat=input.readInt();
		int tot=kor+eng+mat;
		System.out.println(name+"\t"+tot);

	}

}
