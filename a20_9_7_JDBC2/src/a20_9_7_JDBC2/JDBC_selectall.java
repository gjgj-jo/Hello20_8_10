package a20_9_7_JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_selectall {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="select * from member ";	//?는 외부에서 들어오는 파라메터값
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt=con.prepareStatement(sql);
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
