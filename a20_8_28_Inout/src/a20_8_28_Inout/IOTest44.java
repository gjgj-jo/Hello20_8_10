package a20_8_28_Inout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest44 {
//Scanner �̿��Ͽ� �̸�,�ּ�,���� �Է¹޾Ƽ�
	//iotest44.txt �����Ͻÿ�
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸�=");
		String name=sc.next();
		System.out.println("�ּ�=");
		String juso=sc.next();
		System.out.println("��ȭ��ȣ=");
		String tel=sc.next();

		File file=new File("iotest4.txt");
		FileWriter output=new FileWriter(file);
		output.write(name);
		output.write(juso);
		output.write(tel);
		output.close();
	}

}
