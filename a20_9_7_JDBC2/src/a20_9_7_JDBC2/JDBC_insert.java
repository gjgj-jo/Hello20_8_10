package a20_9_7_JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_insert {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="insert into member(code, name, id, pwd, age) values(?,?,?,?,?)";	//?�� �ܺο��� ������ �Ķ���Ͱ�
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement(sql);
			System.out.println("�ڵ��Է�");
			pstmt.setString(1, sc.next());
			
			System.out.println("�̸��Է�");
			pstmt.setString(2, sc.next());
			
			System.out.println("���̵��Է�");
			pstmt.setString(3, sc.next());
			
			System.out.println("����Է�");
			pstmt.setString(4, sc.next());
			
			System.out.println("�����Է�");
			pstmt.setInt(5,sc.nextInt());
			
			int res=pstmt.executeUpdate();
			if(res==1) System.out.println("����");
			else System.out.println("����");
			
			
		}catch (Exception e) {
			System.out.println("������ �ڵ尡 �����մϴ�.");
			System.out.println("����");
		}
		
		finally {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}
