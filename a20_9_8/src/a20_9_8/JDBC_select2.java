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
		PreparedStatement pstmt=null; //�غ����
		ResultSet rs=null; //�����
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,password);
			pstmt=con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=pstmt.executeQuery();
			
			rs.last(); //������ ���ڵ��� ���� ������
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			rs.first();	//ù��° ���ڵ��� ���� ������
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			rs.absolute(3);	//3��° ���ڵ��� ���� ������
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			rs.previous(); //���� ���ڵ��� ���� ������
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getInt(5)+"\n");
			
			//�̰� �� ȿ������ exJDBC_selectCount ����
			rs.last();	//������ ���ڵ��� ������ �̵�  ���������� ������ ������ ī���õ�
			int rows=rs.getRow();	//���ڵ� ������ ����
			System.out.println(rows);		//rs���� ������ ��
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
