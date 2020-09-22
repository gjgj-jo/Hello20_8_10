import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ImageIcon;


//1단계: implements ActionListener를 상속받는다.
public class JDBCProstep1 implements ActionListener {

	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnSearch, btnDel, btnCancel, btnUpdate;
	
	private static final int NONE=0;
	private static final int ADD=1;
	private static final int DELETE=2;
	private static final int SEARCH=3;
	private static final int TOTAL=4;
	private static final int UPDATE=5;
	int cmd=NONE;
	
	Mymodel model;
	
	String driver="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user="system";
	String password="123456";
	String sql="delete from member where id=? and pwd=?";
	Connection con=null;
	PreparedStatement pstmt=null;
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	PreparedStatement pstmtSearch, pstmtSearchScroll;
	
	String sqlTotal="select * from customer";
	String sqlInsert="insert into customer  values(?,?,?,?)";
	String sqlDelete="delete from customer where name=?";
	String sqlUpdate="update customer set email=?, tel=? where code=?";
	String sqlSearch="select * from customer where name=?";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDBCProstep1 window = new JDBCProstep1();
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
	public JDBCProstep1() {
		initialize();
		init();
		dbcon();
	}
	
	public void dbcon() {
		try {
			Class.forName(driver);
		con=DriverManager.getConnection(url,user,password);
		}	catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uACE0\uAC1D\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		frame.setBounds(100, 100, 571, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("번호");
		lblNewLabel.setBounds(29, 47, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(29, 89, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이메일");
		lblNewLabel_2.setBounds(29, 132, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(29, 177, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(131, 44, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(131, 86, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(131, 129, 116, 21);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setBounds(131, 177, 116, 21);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(307, 38, 221, 254);
		frame.getContentPane().add(scrollPane); //actionlistener을 상속받는다
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		//전체보기
		btnTotal = new JButton("전체보기");
		btnTotal.setBounds(11, 372, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		//추가
		btnAdd = new JButton("추가");	
		btnAdd.setBounds(120, 372, 97, 23);
		frame.getContentPane().add(btnAdd);
		
		//삭제
		btnDel = new JButton("삭제");
		btnDel.setBounds(229, 372, 76, 23);
		frame.getContentPane().add(btnDel);
		
		//검색
		btnSearch = new JButton("검색");
		btnSearch.setBounds(317, 372, 64, 23);
		frame.getContentPane().add(btnSearch);
		
		//취소
		btnCancel = new JButton("취소");
		btnCancel.setBounds(473, 372, 70, 23);
		frame.getContentPane().add(btnCancel);
		
		//수정
		btnUpdate = new JButton("수정");
		btnUpdate.setBounds(393, 372, 70, 23);
		frame.getContentPane().add(btnUpdate);
		
		//2단계: 컴포턴트
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUpdate.addActionListener(this);
	}
	//추가버튼의 DB
	//String sqlInsert='insert into customer value(?,?,?,?)";
	public void add() {
		System.out.println("추가");
		String no=txtNo.getText();
		String name=txtName.getText();
		String email=txtEmail.getText();
		String tel=txtTel.getText();
		System.out.println(no+","+name+","+tel);
		try {
			pstmt=con.prepareStatement(sqlInsert);
			pstmt.setInt(1, Integer.valueOf(no));
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);
			int res=pstmt.executeUpdate();
			if(res==1) System.out.println("성공");	
			else System.out.println("실패");
			
		} catch(Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//sqlDelete='delete from customer where name=?";
	//삭제버튼의 DB 
	public void del() {
		System.out.println(txtName.getText()); //txtNAme상자의 값을 가져오라
		try {
			String name=txtName.getText();
			pstmt=con.prepareStatement(sqlDelete);	//1)준비된통 (sql문법 넣어놓은것)
			pstmt.setString(1, name);	//2)준비된 통에 세팅
			int res=pstmt.executeUpdate(); //3) select만 Query 성공은 1 실패는 0
			if(res==1) System.out.println("삭제되었습니다.");
			else System.out.println("실패했습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}	
	//검색버튼의 dB
	public void search() {
		System.out.println("검색");
		System.out.println(txtName.getText());
		try {
			String name=txtName.getText();
			pstmtSearchScroll=con.prepareStatement(sqlSearch,
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);	//동적
			pstmtSearch=con.prepareStatement(sqlSearch);		//정적
			pstmtSearchScroll.setString(1, name); //1은 첫번째?
			pstmtSearch.setString(1, name); //1은첫번째?
			ResultSet rsScroll=pstmtSearchScroll.executeQuery();
			ResultSet rs=pstmtSearch.executeQuery();
			if(model==null) model=new Mymodel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI(); //장착
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmtSearchScroll.close();
				pstmtSearch.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void update() {
		System.out.println(txtName.getText());
		String code=txtNo.getText();
		String email=txtEmail.getText();
		String tel=txtTel.getText();
		try {
			pstmt=con.prepareStatement(sqlUpdate);
			pstmt.setString(1, email);
			pstmt.setString(2, tel);
			pstmt.setInt(3, Integer.valueOf(code));
			int res=pstmt.executeUpdate();
			if(res==1) System.out.println("수정성공");
			else System.out.println("실패");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void total() {
		System.out.println("전체보기");
		try {
			pstmtTotalScroll=con.prepareStatement(sqlTotal,
					ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			pstmtTotal=con.prepareStatement(sqlTotal);
			ResultSet rsScroll=pstmtTotalScroll.executeQuery();
			ResultSet rs=pstmtTotal.executeQuery();
			if(model==null) model=new Mymodel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmtTotalScroll.close();
				pstmtTotal.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//3단계 : acionPerformed 구현한다
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {	//추가버튼 두번
			if(cmd!=ADD) {	//cmd=none입니다
				call(ADD);
				return;
			}
			frame.setTitle("추가");
			add(); //db에 연결하여 insert 작업이 동작
			total();
		} 
		else if(e.getSource()==btnDel) {	//삭제커튼 두번
				if(cmd!=DELETE) {
					call(DELETE);
					return;
			}
			frame.setTitle("삭제");
			del(); //DB에 연결하여 삭제 작업
			total();
		} 
		else if(e.getSource()==btnSearch) {	//검색버튼 두번
			if(cmd!=SEARCH) {
				call(SEARCH);
				return;
			}	
			frame.setTitle("검색");
			search(); //db에 연결하여 검색 작업
		} 
		else if(e.getSource()==btnUpdate) {	//수정버튼 두번
			if(cmd!=UPDATE) {
				call(UPDATE);
				return;
			}
			frame.setTitle("수정");
			update();
			total();
		}
		else if(e.getSource()==btnTotal) {	//전체검색 한번
				call(TOTAL);
			frame.setTitle("전체보기");
			total();
		}
		//취소버튼 인 경우
		System.out.println("취소");
		cmd=NONE;
		init();
	}
	
	public void init() {
		txtNo.setText("");
		txtName.setText("");
		txtEmail.setText("");
		txtTel.setText("");
		txtNo.setEditable(false);
		txtName.setEditable(false);
		txtEmail.setEditable(false);
		txtTel.setEditable(false);
		
		btnTotal.setEnabled(true);
		btnAdd.setEnabled(true);
		btnDel.setEnabled(true);
		btnSearch.setEnabled(true);
		btnCancel.setEnabled(true);
		btnUpdate.setEnabled(true);
	}
	
	public void call(int command) {	//cmd=1,2,3	//텍스트필드의 편집상태 on, off
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		btnCancel.setEnabled(true);
		btnUpdate.setEnabled(false);
		switch(command) {
		case ADD:	
			txtNo.setEditable(true);
			txtName.setEditable(true);
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			
			btnAdd.setEnabled(true);
			cmd=ADD;
			break;
		case DELETE:		
				txtName.setEditable(true);//이름만 편집가능함
				
				btnDel.setEnabled(true);
				cmd=DELETE;
				break;
		case SEARCH:
			txtName.setEditable(true); //이름만 편집가능
			
			btnSearch.setEnabled(true); //Search버튼만 켜기
			cmd=SEARCH;
			break;
		case UPDATE:
			txtNo.setEditable(true);	//작성할 수 있도록
			txtEmail.setEditable(true);
			txtTel.setEditable(true);
			
			btnUpdate.setEnabled(true);
			cmd=UPDATE;
			break;
		case TOTAL:
			cmd=TOTAL;
			break;
		case NONE:
			cmd=NONE;
			break;	
			}
		}
}