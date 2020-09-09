package a20_9_7_JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_update {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="update member set pwd=? where id=?";
		Scanner sc=new Scanner(System.in);
		//�ַܼ� id�� pwd�� �Է¹޾Ƽ� update�ǵ��� �Ͻÿ�.
		
		
		System.out.println("id�� �Է��Ͻÿ�");
		String id=sc.next();
		
		System.out.println("������ ����� �Է��Ͻÿ�");
		String pwd=sc.next();
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, pwd);	//1�� ����ǥ�� pwd�� ����
			pstmt.setString(2, id);	//2�� ����ǥ�� id�� ����
			int res=pstmt.executeUpdate();
			if(res==1) System.out.println("����");
			else System.out.println("����");
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
