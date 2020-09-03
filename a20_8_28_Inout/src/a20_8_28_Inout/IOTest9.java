package a20_8_28_Inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOTest9 {

	public static void main(String[] args) throws Exception {
		File file=new File("iotest8.txt");
		FileInputStream fis=new FileInputStream(file);	//입력용 (파일에서 읽어온다)
		ObjectInputStream input=new ObjectInputStream(fis);
		System.out.println(input.readObject());
		System.out.println(input.readObject());
		System.out.println(input.readObject());
		System.out.println(input.readObject());
		input.close();		//찍혔다 (읽어왔기 때문에)
	}

}
