package a20_9_7_JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_delete {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="delete from member where id=? and pwd=?";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���");
		String id=sc.next();
		System.out.println("����� �Է��ϼ���");
		String pwd=sc.next();
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			int res=pstmt.executeUpdate();
			if(res==1) System.out.println("����");
			else System.out.println("����");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
