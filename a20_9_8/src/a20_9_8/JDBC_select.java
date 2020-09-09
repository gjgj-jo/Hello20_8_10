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
		Statement stmt=null; //����
		ResultSet rs=null; //����� 
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
		//stmt=con.createStatement(); //���븸���
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery(sql); //����� rs�� ������� 5�� ���ڵ� ���
			rs.last(); //last()���������� �̵�-->Ȯ��� ����߰�
			rs.absolute(2); //���� ��ġ 2��°�� �̵� �׷��� previous������ 1��°�ΰ�
							//Ȯ��� ��� �߰��ؾߵ�
			while(rs.previous()) { //previous()�������� �̵� --> Ȯ��� ��� �߰� �ؾߵ�
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
