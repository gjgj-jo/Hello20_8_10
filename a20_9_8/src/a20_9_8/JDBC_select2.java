package a20_9_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC_select2 {

	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="system";
		String password="123456";
		String sql="select * from member";
		Connection con=null;
		PreparedStatement pstmt=null; //준비된통
		ResultSet rs=null; //결과통
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			pstmt=con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=pstmt.executeQuery();
			
			rs.last(); //마지막 레코드의 값을 가져옴
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			rs.first();	//첫번째 레코드의 값을 가져옴
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			rs.absolute(3);	//3번째 레코드의 값을 가져옴
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			rs.previous(); //이전 레코드의 값을 가져옴
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			//이게 더 효율적임 exJDBC_selectCount 보다
			rs.last();	//마지막 레코드의 값으로 이동  마지막으로 가야지 갯수가 카운팅됨
			int rows=rs.getRow();	//레코드 갯수를 구함
			System.out.println(rows);		//rs통을 뒤져서 봄
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
