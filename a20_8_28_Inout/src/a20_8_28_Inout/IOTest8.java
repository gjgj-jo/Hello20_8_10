package a20_8_28_Inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//�ַܼ� �Է��� ���� Object���� iotest8.txt ����(���)
public class IOTest8 {

	public static void main(String[] args) throws Exception {
			File file=new File("iotest8.txt");
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream output=new ObjectOutputStream(fos);
			
			Scanner sc=new Scanner(System.in);
			String name=sc.next(); //�̸�
			int kor=sc.nextInt(); //100
			int eng=sc.nextInt(); //90
			int mat=sc.nextInt(); //80
			
			output.writeObject(name);
			output.writeObject(kor);
			output.writeObject(eng);
			output.writeObject(mat);
			output.close();		//����
		
	}

}
