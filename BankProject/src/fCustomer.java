import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class fCustomer extends JInternalFrame implements ActionListener {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	//---------------------------------------------------------------------------
	JButton btnMoveLast,btnMoveFirst,btnMovePrev,btnMoveNext;
	JButton btnPrintItem,btnSaveItem,btnInsertItem,btnDeleteItem,btnCloseWindow;
	JComboBox jcb1;
	
	static Connection conn = null;
	static ResultSet rs = null;
	static Statement stmt = null;
	static String strQuery = "Select c_no, c_name, c_addr, c_phone, c_dist from customer";
	
	String strCno, strCname, strCaddr, strCphone, strDist;
	static String customer_dist[] = { "개인고객", "기업고객" } ;
	boolean bInsertFlag = false;
	
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user="system";
	private String pwd="123456";

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
			//	try {
				//	fCustomer window = new fCustomer();
			//		window.this.setVisible(true);
			//	} catch (Exception e) {
			//		e.printStackTrace();
			//	}
			//}
	//	});
//	}

	/**
	 * Create the application.
	 */
	public fCustomer() {
		initialize();	//디자이너
		dbConnect();	//db연결
		initResultSet(strQuery);
	}
	
	public void dbConnect() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,pwd);
			System.out.println("DB연결");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void initResultSet(String strQuery) {
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); 
			 rs = stmt.executeQuery(strQuery);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "SQLException");

		}
	}
	

	/**
	 * Initialize the contents of the this.
	 */
	private void initialize() {
//		frame = new JFrame();
		this.setBounds(100, 100, 515, 408);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("고객번호");
		lblNewLabel.setBounds(40, 57, 57, 15);
		this.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("고객이름");
		lblNewLabel_1.setBounds(40, 103, 57, 15);
		this.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setBounds(40, 145, 57, 15);
		this.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(40, 190, 57, 15);
		this.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("고객구분");
		lblNewLabel_4.setBounds(40, 240, 57, 15);
		this.getContentPane().add(lblNewLabel_4);
		
		tf1 = new JTextField();
		tf1.setBounds(134, 54, 116, 21);
		this.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(134, 100, 116, 21);
		this.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(134, 142, 116, 21);
		this.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(134, 187, 116, 21);
		this.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		btnMoveFirst = new JButton("");
		btnMoveFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMoveFirst.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\FIRST.GIF"));
		btnMoveFirst.setBounds(0, 0, 41, 33);
		this.getContentPane().add(btnMoveFirst);
		
		btnMoveLast = new JButton("");
		btnMoveLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMoveLast.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\LAST.GIF"));
		btnMoveLast.setBounds(111, 0, 41, 33);
		this.getContentPane().add(btnMoveLast);
		
		jcb1 = new JComboBox();
		jcb1.setBounds(134, 237, 79, 18);
		this.getContentPane().add(jcb1);
		for(int i=0; i<customer_dist.length; i++) {
			 jcb1.addItem(customer_dist[i]);
			 }
		
		btnMovePrev = new JButton("");
		btnMovePrev.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\PREV.GIF"));
		btnMovePrev.setBounds(40, 0, 37, 33);
		this.getContentPane().add(btnMovePrev);
		
		btnMoveNext = new JButton("");
		btnMoveNext.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\NEXT.GIF"));
		btnMoveNext.setBounds(72, 0, 41, 33);
		this.getContentPane().add(btnMoveNext);
		
		btnPrintItem = new JButton("");
		btnPrintItem.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\PRINT.GIF"));
		btnPrintItem.setBounds(232, 0, 46, 34);
		this.getContentPane().add(btnPrintItem);
		
		btnSaveItem = new JButton("");
		btnSaveItem.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\SAVE.GIF"));
		btnSaveItem.setBounds(277, 0, 41, 33);
		this.getContentPane().add(btnSaveItem);
		
		btnInsertItem = new JButton("");
		btnInsertItem.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\INSERT.GIF"));
		btnInsertItem.setBounds(150, 0, 41, 33);
		this.getContentPane().add(btnInsertItem);
		
		btnDeleteItem = new JButton("");
		btnDeleteItem.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\DELETE.GIF"));
		btnDeleteItem.setBounds(190, 0, 41, 33);
		this.getContentPane().add(btnDeleteItem);
		
		btnCloseWindow = new JButton("");
		btnCloseWindow.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\EXIT.GIF"));
		btnCloseWindow.setBounds(317, 0, 41, 33);
		this.getContentPane().add(btnCloseWindow);
		
		btnMoveLast.addActionListener(this);
		btnMoveFirst.addActionListener(this);
		btnMovePrev.addActionListener(this);
		btnMoveNext.addActionListener(this);
		
		btnPrintItem.addActionListener(this);
		btnSaveItem.addActionListener(this);
		btnInsertItem.addActionListener(this);
		btnDeleteItem.addActionListener(this);
		btnCloseWindow.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSaveItem) {
			
		}else if(e.getSource()==btnInsertItem) {
			subInsertItem();
		}else if(e.getSource()==btnDeleteItem) {
			subDeleteItem();
		}else if(e.getSource()==btnMoveFirst) {
			subMoveFirst();
		}else if(e.getSource()==btnMovePrev) {
			subMovePrev();
		}else if(e.getSource()==btnMoveLast) {
			subMoveLast();
		}else if(e.getSource()==btnMoveNext) {
			subMoveNext();
		}else if(e.getSource()==btnPrintItem) {
			subPrintItem();
		}else if(e.getSource()==btnCloseWindow) {
			subCloseWindow();
		}	
	}
	public void clearItems() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
	}
	
	public boolean getItems() {
		int intIndex;
		strCno = tf1.getText().trim();
		strCname = tf2.getText().trim();
		strCaddr = tf3.getText().trim();
		strCphone = tf4.getText().trim();
		intIndex = jcb1.getSelectedIndex();
		if (strCno == null) {
			JOptionPane.showMessageDialog(null, "고객번호가 누락되었습니다.");
			return false;
		}
		if (strCno.length() < 12) {
			JOptionPane.showMessageDialog(null, "잘못된 고객번호입니다.");
			return false;
		}
		if (strCname == null) {
			JOptionPane.showMessageDialog(null, "고객성명이 누락되었습니다.");
			return false;
		}
		switch (intIndex) {
		case 0:
			strDist = "00";
		case 1:
			strDist = "11";
		}
		return true;
	}

	public void setItems() {
		try {
			strCno = rs.getString(1).trim(); // c_no
			strCname = rs.getString(2).trim(); // c_name
			strCaddr = rs.getString(3); // c_addr
			strCphone = rs.getString(4); // c_phone
			strDist = rs.getString(5).trim(); // c_dist
			System.out.println(strCno + "," + strCname + "," + strCaddr + "," + strCphone + "," + strDist);
			tf1.setText(strCno);
			tf2.setText(strCname);
			tf3.setText(strCaddr);
			tf4.setText(strCphone);
			/*
			 * 고객구분코드의 값에 따라 setting 00 : 개인고객 , 11 : 기업고객
			 */
			if (strDist.equals("00")) {
				jcb1.setSelectedIndex(0);
			} else if (strDist.equals("11")) {
				jcb1.setSelectedIndex(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void subSaveItem() {
		if (bInsertFlag == true) { // Insert버튼이 눌렸다면..
			if (getItems()) {
				try {
					rs.moveToInsertRow(); // cursor의 위치를 insert buffer로 이동
					rs.updateString(1, strCno.trim()); // cursor의 내용을 클래스 변수로 setting
					rs.updateString(2, strCname.trim());
					rs.updateString(3, strCaddr.trim());
					rs.updateString(4, strCphone.trim());
					rs.updateString(5, strDist.trim());
					rs.insertRow(); // setting된 insert buffer내용을 데이터베이스에 반영
					bInsertFlag = false;
					conn.commit();
					rs.moveToCurrentRow();
				} catch (SQLException se) {
					JOptionPane.showMessageDialog(null, se);
				}
			}
		} else { // insert 버튼이 눌리지 않았다면
			if (getItems()) {
				try {
					rs.updateString(1, strCno.trim()); // 클래스 변수의 내용을 cursor에 반영
					rs.updateString(2, strCname.trim());
					rs.updateString(3, strCaddr.trim());
					rs.updateString(4, strCphone.trim());
					rs.updateString(5, strDist.trim());
					rs.updateRow(); // cursor의 변경사항을 데이터베이스에 반영
					conn.commit();
				} catch (SQLException se) {
					JOptionPane.showMessageDialog(null, se);
					se.printStackTrace();
				}
			}
		}
	}
	public void subInsertItem() {
		clearItems();
		bInsertFlag = true;
	}

	public void subDeleteItem() {
		int rtnValue;
		rtnValue = JOptionPane.showConfirmDialog(null, "현재 데이터를 삭제 합니다.", "확인", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		try {
			if (rtnValue == 0) {
				rs.deleteRow();
				subMoveNext(); // 다음행으로 이동
				conn.commit();
			}
		} catch (SQLException se) {
			JOptionPane.showMessageDialog(null, se);
		}
	}
	public void subMoveFirst() {
		try {
			if (!rs.isFirst()) {
				rs.first();
				setItems();
			}
		} catch (SQLException se) {
			JOptionPane.showMessageDialog(null, se);
		}
	}
	public void subMovePrev() {
		try {
			if(!rs.isFirst()) {
			rs.previous();
			setItems();
		}
		}catch(SQLException se) {
			JOptionPane.showMessageDialog(null, se);
		}
		}

	public void subMoveLast() {
		try {
			if (!rs.isLast()) {
				rs.last();
				setItems();
			}
		} catch (SQLException se) {
			JOptionPane.showMessageDialog(null, se);
		}
	}
	public void subMoveNext() {
		try {
			if (!rs.isLast()) {
				rs.next();
				setItems();
			}
		} catch (SQLException se) {
			JOptionPane.showMessageDialog(null, se);
		}
	}
	public void subPrintItem() {
		}
	public void subCloseWindow() {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.dispose();
	}
}