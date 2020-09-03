import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class test implements ActionListener{

	private JFrame frame;
	private JTextField txtNo;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTable table;
	private JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
					window.frame.setTitle("연습용");
					window.frame.setBounds(100,100,300,300);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 600, 312);
		frame.setTitle("연습용");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnTotal = new JButton("\uC804\uCCB4\uBCF4\uAE30");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnTotal.setBounds(12, 228, 97, 23);
		frame.getContentPane().add(btnTotal);
		
		btnAdd = new JButton("\uCD94\uAC00");
		btnAdd.setBounds(121, 228, 97, 23);
		frame.getContentPane().add(btnAdd);
		
		btnDel = new JButton("\uC0AD\uC81C");
		btnDel.setBounds(240, 228, 97, 23);
		frame.getContentPane().add(btnDel);
		
		btnSearch = new JButton("\uAC80\uC0C9");
		btnSearch.setBounds(351, 228, 97, 23);
		frame.getContentPane().add(btnSearch);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(460, 228, 97, 23);
		frame.getContentPane().add(btnCancel);
		
		JLabel lbl1 = new JLabel("\uBC88\uD638");
		lbl1.setBounds(24, 25, 57, 15);
		frame.getContentPane().add(lbl1);
		
		JLabel lb2 = new JLabel("\uC774\uB984");
		lb2.setBounds(24, 62, 57, 15);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("\uC774\uBA54\uC77C");
		lb3.setBounds(24, 100, 57, 15);
		frame.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("\uC804\uD654\uBC88\uD638");
		lb4.setBounds(24, 141, 57, 15);
		frame.getContentPane().add(lb4);
		
		txtNo = new JTextField();
		txtNo.setBounds(93, 22, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(93, 62, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(93, 100, 116, 21);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtTel = new JTextField();
		txtTel.setBounds(93, 138, 116, 21);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(294, 25, 222, 163);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTotal) {
			System.out.print(txtNo.getText()+"\t");
			System.out.print(txtName.getText()+"\t");
			System.out.print(txtEmail.getText()+"\t");
			System.out.print(txtTel.getText()+"\t");
			System.out.println("전체보기");
		}
		else if(e.getSource()==btnAdd) {
			System.out.println("추가");
		}
		else if(e.getSource()==btnDel) {
			System.out.println("삭제");
		}
		else if(e.getSource()==btnSearch) {
			System.out.println("검색");
		}
		else if(e.getSource()==btnCancel) {
			System.out.println("취소");
			txtNo.setText("");
			txtName.setText("");
			txtEmail.setText("");
			txtTel.setText("");
		}
	}
}
