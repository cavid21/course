package course_VA;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Evler extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evler frame = new Evler();
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
	Connection conn = null;
	public Evler() {
		conn = Driver.connector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEv = new JLabel("Ev1");
		lblEv.setBounds(0, 0, 26, 26);
		contentPane.add(lblEv);
		
		JLabel lblEv_1 = new JLabel("Ev2");
		lblEv_1.setBounds(0, 196, 26, 20);
		contentPane.add(lblEv_1);
		
		JLabel lblEv_2 = new JLabel("Ev3");
		lblEv_2.setBounds(296, 6, 26, 20);
		contentPane.add(lblEv_2);
		
		JLabel label = new JLabel("1");
		Image img = new ImageIcon(this.getClass().getResource("/ev1.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 35, 275, 150);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2");
		Image img1 = new ImageIcon(this.getClass().getResource("/ev2.png")).getImage();
		label_1.setIcon(new ImageIcon(img1));
		label_1.setBounds(0, 227, 275, 150);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3");
		Image img2 = new ImageIcon(this.getClass().getResource("/ev3.png")).getImage();
		label_2.setIcon(new ImageIcon(img2));
		label_2.setBounds(296, 35, 262, 150);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Ev3");
		label_3.setBounds(296, 199, 26, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("4");
		Image img3 = new ImageIcon(this.getClass().getResource("/ev4.png")).getImage();
		label_4.setIcon(new ImageIcon(img2));
		label_4.setBounds(296, 227, 262, 150);
		contentPane.add(label_4);
		
		JButton btnNewButton = new JButton("geri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table_1 window = new Table_1();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(511, 2, 57, 23);
		contentPane.add(btnNewButton);
	}
}
