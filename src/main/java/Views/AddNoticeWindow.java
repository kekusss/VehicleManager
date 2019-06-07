package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class AddNoticeWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAddNotice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNoticeWindow frame = new AddNoticeWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddNoticeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldAddNotice = new JTextField();
		textFieldAddNotice.setBounds(10, 11, 414, 185);
		contentPane.add(textFieldAddNotice);
		textFieldAddNotice.setColumns(10);
		
		JButton btnConfirmNotice = new JButton("Dodaj");
		btnConfirmNotice.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnConfirmNotice.setBounds(10, 207, 414, 43);
		contentPane.add(btnConfirmNotice);
	}

}