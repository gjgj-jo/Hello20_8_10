package a20_8_28_Inout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest44 {
//Scanner 이용하여 이름,주소,전번 입력받아서
	//iotest44.txt 저장하시오
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름=");
		String name=sc.next();
		System.out.println("주소=");
		String juso=sc.next();
		System.out.println("전화번호=");
		String tel=sc.next();

		File file=new File("iotest4.txt");
		FileWriter output=new FileWriter(file);
		output.write(name);
		output.write(juso);
		output.write(tel);
		output.close();
	}

}
