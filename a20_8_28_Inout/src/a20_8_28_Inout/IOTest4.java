package a20_8_28_Inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class IOTest4 {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
	
		//byte --> ���� --> ������(���ڿ��������)
		
		String name=br.readLine();
		String id=br.readLine();
		String pwd=br.readLine();
		String age=br.readLine();
		String tel=br.readLine();
		
		System.out.println(name+"\t"+id+"\t"+pwd+"\t"+age+"\t"+tel);
		
		File file=new File("iotest4.txt");  //iotest4.txt�� ���ϰ�ü��. �����Ȱ��� �ƴ�
		FileWriter output=new FileWriter(file);
		output.write(name);
		output.write(id);
		output.write(pwd);
		output.write(age);
		output.write(tel);
		output.close(); //�̰� ���ϸ� ���� �ȵɼ��� �ִ�.
		
	}

}
