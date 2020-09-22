import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class sungjuk {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtKor;
	private JTextField txtMat;
	private JTextField txtEng;
	private JTextField txtNo;
	private JTextField txtAvg;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sungjuk window = new sungjuk();
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
	public sungjuk() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCal = new JButton("계산");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kors=txtKor.getText();	//텍스트필드의 값은 문자열만 가능
				String engs=txtEng.getText();
				String mats=txtMat.getText();
				int kor=Integer.valueOf(kors); //정수로 변환해야 계산가능
				int eng=Integer.valueOf(engs);
				int mat=Integer.valueOf(mats);
				int tot=kor+eng+mat;		//총점구하기
				double avg=tot/3.0;
				String tots=String.valueOf(tot);  //문자를 숫자로 바꾸기
				txtTot.setText(tot);      //텍스트필드에는 문자열만 가능
				txtAvg.setText(avgs);
				
			}
		});
		btnCal.setBounds(12, 341, 63, 23);
		frame.getContentPane().add(btnCal);
		
		JButton btnInsert = new JButton("추가");
		btnInsert.setBounds(87, 341, 63, 23);
		frame.getContentPane().add(btnInsert);
		
		txtName = new JTextField();
		txtName.setBounds(122, 45, 116, 21);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtKor = new JTextField();
		txtKor.setBounds(122, 82, 116, 21);
		frame.getContentPane().add(txtKor);
		txtKor.setColumns(10);
		
		txtMat = new JTextField();
		txtMat.setBounds(122, 126, 116, 21);
		frame.getContentPane().add(txtMat);
		txtMat.setColumns(10);
		
		txtEng = new JTextField();
		txtEng.setBounds(122, 171, 116, 21);
		frame.getContentPane().add(txtEng);
		txtEng.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("학번");
		lblNewLabel_4.setBounds(12, 10, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtNo = new JTextField();
		txtNo.setBounds(122, 7, 116, 21);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);
		
		JTextField txtTot = new JTextField();
		txtTot.setEditable(false);
		txtTot.setBounds(122, 221, 116, 21);
		frame.getContentPane().add(txtTot);
		txtTot.setColumns(10);
		
		txtAvg = new JTextField();
		txtAvg.setEditable(false);
		txtAvg.setBounds(122, 261, 116, 21);
		frame.getContentPane().add(txtAvg);
		txtAvg.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(276, 10, 191, 289);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnDel = new JButton("삭제");
		btnDel.setBounds(162, 341, 57, 23);
		frame.getContentPane().add(btnDel);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.setBounds(231, 341, 63, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnTotal = new JButton("전체보기");
		btnTotal.setBounds(306, 341, 81, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnFirst = new JButton("");
		btnFirst.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\FIRST.GIF"));
		btnFirst.setBounds(24, 304, 45, 21);
		frame.getContentPane().add(btnFirst);
		
		JButton btnPrev = new JButton("");
		btnPrev.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\PREV.GIF"));
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrev.setBounds(111, 304, 38, 21);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("");
		btnNext.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\NEXT.GIF"));
		btnNext.setBounds(162, 304, 32, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnLast = new JButton("");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLast.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\LAST.GIF"));
		btnLast.setBounds(206, 304, 45, 22);
		frame.getContentPane().add(btnLast);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(12, 48, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("국어");
		lblNewLabel_1.setBounds(12, 85, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("수학");
		lblNewLabel_2.setBounds(18, 129, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("영어");
		lblNewLabel_3.setBounds(18, 174, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("총점");
		lblNewLabel_5.setBounds(18, 224, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("평균");
		lblNewLabel_6.setBounds(12, 264, 57, 15);
		frame.getContentPane().add(lblNewLabel_6);
	}
}