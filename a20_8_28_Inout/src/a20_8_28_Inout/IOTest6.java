package a20_8_28_Inout;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

//(�⺻�ڷ����� int, double, char...) �״�� ���Ϸ� �����ϱ�
//�ַܼ� �Է��� �̸�, ����, ����, ���� ���� �Է¹޾Ƽ�
//iotest6.txt�����Ͻÿ�
public class IOTest6 {

	public static void main(String[] args) throws Exception {
		File file=new File("iotest6.txt");
		FileOutputStream fos=new FileOutputStream(file);
		DataOutputStream output=new DataOutputStream(fos);
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int mat=sc.nextInt();
		
		output.writeUTF(name);
		output.writeInt(kor);
		output.writeInt(eng);
		output.writeInt(mat);
		output.close();
		
	}

}
