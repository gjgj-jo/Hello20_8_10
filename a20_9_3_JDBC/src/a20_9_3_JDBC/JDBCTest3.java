package a20_9_3_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//update member set pwd='9999' where id='1001'
public class JDBCTest3 {
	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		Connection con=null;
		Statement stmt=null;
		String sql="update member set code='1004' where name='ȫ�浿'";
		
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			stmt=con.createStatement();
			int re=stmt.executeUpdate(sql);
			if(re==1) System.out.println("����");
			else System.out.println("����");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			finally {
					con.close();
				} 
			}
		
		

	


}
