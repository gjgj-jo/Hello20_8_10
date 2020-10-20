
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class mainBank implements ActionListener {

	private JFrame frame;
	JMenuItem ItemExit, ItemCustomer, ItemBranch;
	fCustomer ifCustomer;
	frmBranch ifBranch;
	frmDepositKind ifDepositKind;
	frmDepositOrder ifDepositOrder;
	frmDepositStatement ifDepositStatement ;
	frmInOut ifInOut;
	frmLoanKind ifLoanKind;
	frmLoanOrder ifLoanOrder;
	frmPayBack ifPayBack;

	
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
	private JMenu menu;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainBank window = new mainBank();
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
	public mainBank() {
		initialize();
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
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("시스템");
		menuBar.add(mnNewMenu);

		ItemExit = new JMenuItem("종료");
		mnNewMenu.add(ItemExit);

		JMenu mnNewMenu_1 = new JMenu("고객/지점관리");
		menuBar.add(mnNewMenu_1);

		ItemCustomer = new JMenuItem("고객관리");
		mnNewMenu_1.add(ItemCustomer);

		ItemBranch = new JMenuItem("지점관리");
		mnNewMenu_1.add(ItemBranch);
		
		menu = new JMenu("대출");
		menuBar.add(menu);
		
		mntmNewMenuItem = new JMenuItem("대출종류");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menuLoanKind();
			}
		});
		menu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("대출신청");
		menu.add(mntmNewMenuItem_1);
		
		mnNewMenu_2 = new JMenu("입출금");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_2 = new JMenuItem("입출금");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				menuInOut();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		mnNewMenu_3 = new JMenu("예금");
		menuBar.add(mnNewMenu_3);

		ItemExit.addActionListener(this);
		ItemCustomer.addActionListener(this);
		ItemBranch.addActionListener(this);
	}
	
	public void menuLoanKind() {
		
	}
	public void menuInOut() {
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ItemCustomer)
			menuCustomer();
		if (e.getSource() == ItemExit)
			menuExit();
		if(e.getSource() == ItemBranch) 
			menuBranch();
	}
	public void menuBranch() {
		ifBranch = new frmBranch("지점관리", conn, null);
		ifCustomer.pack();		//장착
		ifCustomer.setVisible(true);	//보이도록
		frame.getContentPane().add(ifCustomer);
		try {
			ifCustomer.setSelected(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void menuCustomer() {
		ifCustomer = new fCustomer();
		ifCustomer.pack();		//장착
		ifCustomer.setVisible(true);	//보이도록
		frame.getContentPane().add(ifCustomer);
		try {
			ifCustomer.setSelected(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void menuExit() {
		System.exit(0);
	}
}
