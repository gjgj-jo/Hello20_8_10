package a20_8_28_Inout;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

//(기본자료형태 int, double, char...) 그대로 파일로 저장하기
//콘솔로 입력한 이름, 국어, 수학, 영어 점수 입력받아서
//iotest6.txt저장하시오
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
