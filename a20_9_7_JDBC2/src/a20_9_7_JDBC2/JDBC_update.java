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
		//콘솔로 id와 pwd를 입력받아서 update되도록 하시오.
		
		
		System.out.println("id를 입력하시오");
		String id=sc.next();
		
		System.out.println("변경할 비번을 입력하시오");
		String pwd=sc.next();
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, pwd);	//1번 물음표는 pwd에 대입
			pstmt.setString(2, id);	//2번 물음표는 id에 대입
			int res=pstmt.executeUpdate();
			if(res==1) System.out.println("성공");
			else System.out.println("실패");
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
