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
		String sql="insert into member(code, name, id, pwd, age) values(?,?,?,?,?)";	//?는 외부에서 들어오는 파라메터값
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			pstmt=con.prepareStatement(sql);
			System.out.println("코드입력");
			pstmt.setString(1, sc.next());
			
			System.out.println("이름입력");
			pstmt.setString(2, sc.next());
			
			System.out.println("아이디입력");
			pstmt.setString(3, sc.next());
			
			System.out.println("비번입력");
			pstmt.setString(4, sc.next());
			
			System.out.println("나이입력");
			pstmt.setInt(5,sc.nextInt());
			
			int res=pstmt.executeUpdate();
			if(res==1) System.out.println("성공");
			else System.out.println("실패");
			
			
		}catch (Exception e) {
			System.out.println("동일한 코드가 존재합니다.");
			System.out.println("실패");
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
