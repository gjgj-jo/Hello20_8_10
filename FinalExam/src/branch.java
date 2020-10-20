import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class branch implements ActionListener {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf5;
	private JTextField tf4;
	private JTextField tf3;
	private JTable table;

	JButton btnInsert, btnSave, btnCancel;
	
	static Connection conn = null;
	static ResultSet rs = null;
	static Statement stmt = null;
	static String strQuery = "Select b_no, b_name, b_addr, b_phone, b_assets from branch";
	
	String strBno, strBname, strBaddr, strBphone, strAssets;
	//★★★
	
	private static final int NONE=0;
	private static final int ADD=1;
	private static final int UPDATE=2;
	int cmd=NONE;
	
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user="system";
	private String pwd="123456";
	
	String sqlInsert="insert into branch values(?,?,?,?)";
	String sqlUpdate="update customer set name=?, addr=?, phone=? where assets=?";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					branch window = new branch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public branch() {
		initialize();
		dbConnect();
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
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 571, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnInsert = new JButton("추가");
		btnInsert.setBounds(12, 10, 97, 23);
		frame.getContentPane().add(btnInsert);
		
		btnSave = new JButton("저장");
		btnSave.setBounds(121, 10, 97, 23);
		frame.getContentPane().add(btnSave);
		
		btnCancel = new JButton("취소");
		btnCancel.setBounds(230, 10, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("지점번호");
		lblNewLabel.setBounds(22, 43, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("지점명");
		lblNewLabel_1.setBounds(22, 68, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setBounds(22, 93, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(22, 118, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("자산총액");
		lblNewLabel_4.setBounds(22, 143, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		tf1 = new JTextField();
		tf1.setBounds(91, 40, 116, 21);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(91, 65, 116, 21);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(91, 90, 116, 21);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(91, 115, 116, 21);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(91, 140, 116, 21);
		frame.getContentPane().add(tf5);
		tf5.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 187, 498, 189);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		
		btnInsert.addActionListener(this);
		btnSave.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnInsert) {
			
		}
		else if(e.getSource()==btnSave) {
			
		}
		else if(e.getSource()==btnCancel) {
			
		}
	}
}
