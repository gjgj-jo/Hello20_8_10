import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class fDepositOrder implements ActionListener {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTable table;
	
	JButton btnCloseWindow, btnPrintItem, btnSaveItem,btnInsertItem;
	JComboBox jcb1, jcb2, jcb3;
	
	boolean bInsertFlag = true;
	static String customer_dist[] = { "개인고객", "기업고객" };
	Object columnName[] = {"계좌번호", "예금상품명", "고객번호", "고객명", "개설일"};
	Object dataTable[][] = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fDepositOrder window = new fDepositOrder();
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
	public fDepositOrder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnInsertItem = new JButton("");
		btnInsertItem.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\INSERT.GIF"));
		btnInsertItem.setBounds(12, 10, 44, 33);
		frame.getContentPane().add(btnInsertItem);
		
		btnSaveItem = new JButton("");
		btnSaveItem.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\SAVE.GIF"));
		btnSaveItem.setBounds(68, 10, 44, 33);
		frame.getContentPane().add(btnSaveItem);
		
		btnPrintItem = new JButton("");
		btnPrintItem.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\PRINT.GIF"));
		btnPrintItem.setBounds(124, 10, 44, 33);
		frame.getContentPane().add(btnPrintItem);
		
		btnCloseWindow = new JButton("");
		btnCloseWindow.setIcon(new ImageIcon("C:\\GITHUB\\kmoveproject\\kmove22\\src_소스\\TOOLBAR\\EXIT.GIF"));
		btnCloseWindow.setBounds(180, 10, 44, 33);
		frame.getContentPane().add(btnCloseWindow);
		
		JLabel lblNewLabel = new JLabel("지점");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(26, 66, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("고객구분");
		lblNewLabel_1.setBounds(26, 91, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("계좌번호");
		lblNewLabel_2.setBounds(26, 116, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("예금종류");
		lblNewLabel_3.setBounds(26, 141, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("계약기간");
		lblNewLabel_4.setBounds(26, 166, 57, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("고객번호");
		lblNewLabel_5.setBounds(26, 191, 57, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		jcb1 = new JComboBox();
		jcb1.setBounds(124, 63, 77, 21);
		frame.getContentPane().add(jcb1);
		
		jcb2 = new JComboBox();
		jcb2.setBounds(124, 88, 77, 21);
		frame.getContentPane().add(jcb2);
		
		jcb3 = new JComboBox();
		jcb3.setBounds(124, 141, 97, 21);
		frame.getContentPane().add(jcb3);
		
		tf1 = new JTextField();
		tf1.setBounds(124, 113, 171, 21);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(124, 166, 141, 21);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(124, 191, 158, 21);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 239, 412, 114);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		
		JLabel lbStatusMessage = new JLabel("New label");
		lbStatusMessage.setBounds(0, 377, 486, 15);
		frame.getContentPane().add(lbStatusMessage);
		
		btnInsertItem.addActionListener(this);
		btnSaveItem.addActionListener(this);
		btnPrintItem.addActionListener(this);
		btnCloseWindow.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnInsertItem) {
			System.out.println("삽입");
		}
		else if(e.getSource()==btnSaveItem) {
			System.out.println("저장");
		}
		else if(e.getSource()==btnPrintItem) {
			System.out.println("프린트");
		}
		else if(e.getSource()==btnCloseWindow) {
			System.exit(0);
		}
	}
}
