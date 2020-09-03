import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uACFC\uC81C \uC870\uACBD\uC9C4");
		frame.setBounds(100, 100, 539, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC624\uB298\uC758 \uB0A0\uC9DC\uC640 \uC2DC\uAC04");
		lblNewLabel.setBounds(12, 22, 111, 15);
		frame.getContentPane().add(lblNewLabel);
	}
}
