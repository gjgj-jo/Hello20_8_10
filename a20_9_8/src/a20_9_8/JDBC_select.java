package a20_9_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_select {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="select * from member";
		Connection con=null;
		Statement stmt=null; //빈통
		ResultSet rs=null; //결과통 
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
		//stmt=con.createStatement(); //빈통만들기
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery(sql); //결과통 rs에 결과물이 5개 레코드 담김
			rs.last(); //last()마지막으로 이동-->확장된 명령추가
			rs.absolute(2); //절대 위치 2번째로 이동 그러나 previous때문에 1번째로감
							//확장된 명령 추가해야됨
			while(rs.previous()) { //previous()이전으로 이동 --> 확장된 명령 추가 해야됨
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getInt(5)+"\n");
				
			}
			
	} catch(Exception e) {
		
	}

}
}
