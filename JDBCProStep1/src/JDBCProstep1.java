import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDBCProstep1 implements ActionListener {

	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnSearch, btnDel, btnCancel;

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
		btnTotal.setBounds(12, 372, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		//추가
		btnAdd = new JButton("추가");	
		btnAdd.setBounds(120, 372, 97, 23);
		frame.getContentPane().add(btnAdd);
		
		//삭제
		btnDel = new JButton("삭제");
		btnDel.setBounds(229, 372, 97, 23);
		frame.getContentPane().add(btnDel);
		
		//검색
		btnSearch = new JButton("검색");
		btnSearch.setBounds(338, 372, 97, 23);
		frame.getContentPane().add(btnSearch);
		
		//취소
		btnCancel = new JButton("취소");
		btnCancel.setBounds(458, 372, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {	//추가버튼 두번
			frame.setTitle("추가");
		} else if(e.getSource()==btnDel) {	//삭제커튼 두번
			frame.setTitle("삭제");
		} else if(e.getSource()==btnSearch) {	//검색버튼 두번
			frame.setTitle("검색");
		} else if(e.getSource()==btnTotal) {	//전체검색 한번
			frame.setTitle("전체보기");
		}
		//취소버튼 인 경우
		System.out.println("취소");
		//frame.setTitle("취소");
	}
}
