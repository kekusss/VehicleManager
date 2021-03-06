package Views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class AddNewNoticeWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewNoticeWindow frame = new AddNewNoticeWindow();
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
	public AddNewNoticeWindow() {
		setTitle("Dodaj now� uwag�");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textAreaNoticeContents = new JTextArea();
		textAreaNoticeContents.setBounds(10, 11, 414, 179);
		contentPane.add(textAreaNoticeContents);
		
		/**
		 * Przycisk odpowiadaj�cy za dodawanie nowej uwagi
		 */
		JButton btnSaveNotice = new JButton("Dodaj");
		btnSaveNotice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnSaveNotice.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSaveNotice.setBounds(154, 201, 126, 49);
		contentPane.add(btnSaveNotice);
	}
}
