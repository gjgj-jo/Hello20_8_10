package a20_9_7_JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_select {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="select * from member where id=? and pwd=?";	//?�� �ܺο��� ������ �Ķ���Ͱ�
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("id�� �Է�");
		String id=sc.next();
		
		System.out.println("����� �Է�");
		String pwd=sc.next();
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id); //1�� ����ǥ
			pstmt.setString(2, pwd); //2�� ����ǥ id & pwd �� pwd
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+" ");	//ResultSet���� 1���ʵ�
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.println(rs.getInt(5));
				//Result�� �����ͺ��̽��� �����
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
