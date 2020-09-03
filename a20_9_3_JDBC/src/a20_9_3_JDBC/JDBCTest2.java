package a20_9_3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTest2 {

	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="insert into member(code,name,id, pwd) "+ "values('1005','최고야','choi','choi')";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int re=stmt.executeUpdate(sql); //성공하면 1 실패하면 0
		if(re==1) System.out.println("성공");

	}

}
