package a20_9_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exJDBC_selectCount {

	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="select count(*) from member"; //갯수
		Connection con=null;
		Statement stmt=null; //준비된통
		ResultSet rs=null; //결과통
		
		Class.forName(driver);
		con=DriverManager.getConnection(url,user,password);
		
		stmt=con.createStatement(); //빈통
		rs=stmt.executeQuery(sql);
		rs.next();
		System.out.println(rs.getInt(1));

	}

}
