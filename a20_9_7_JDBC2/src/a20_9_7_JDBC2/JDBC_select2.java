package a20_9_7_JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_select2 {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		//String sql="select * from member where name like '%홍%';
		//홍이 내가 입력하는 데이터. %는 ~로 시작하는 것
		String sql="select * from member where name like '%";
		//일부글자는 물음표가 안돼. 그래서 짜집기하자
		
		System.out.println("검색할 이름의 단어를 입력하세요.");
		Scanner sc=new Scanner(System.in);
		String temp=sc.next();
		
		sql=sql+temp+"%'";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+"  ");
				System.out.print(rs.getString(2)+"  ");
				System.out.print(rs.getString(3)+"  ");
				System.out.print(rs.getString(4)+"  ");
				System.out.print(rs.getInt(5)+"  ");
			}
			
		}catch(Exception e) {
			
		}

	}

}
