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
		String sql="select * from member where id=? and pwd=?";	//?는 외부에서 들어오는 파라메터값
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("id를 입력");
		String id=sc.next();
		
		System.out.println("비번을 입력");
		String pwd=sc.next();
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id); //1번 물음표
			pstmt.setString(2, pwd); //2번 물음표 id & pwd 중 pwd
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+" ");	//ResultSet에서 1번필드
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.println(rs.getInt(5));
				//Result는 데이터베이스의 결과값
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
