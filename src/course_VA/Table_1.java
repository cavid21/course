package course_VA;

import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Table_1 {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_1 window = new Table_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection conn = null;
	
	public Table_1() {
		initialize();
		conn = Driver.connector();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTables = new JButton("M\u00FC\u015Ft\u0259ril\u0259r");
		btnTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Musteriler musteriler = new Musteriler();
				musteriler.setVisible(true);
			}
		});
		btnTables.setBounds(280, 115, 109, 40);
		frame.getContentPane().add(btnTables);
		
		JButton btnAlicilar = new JButton("Sat\u0131c\u0131lar");
		btnAlicilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Alicilar alicilar = new Alicilar();
				alicilar.setVisible(true);
			}
		});
		btnAlicilar.setBounds(154, 115, 109, 40);
		frame.getContentPane().add(btnAlicilar);
		
		JButton btnMusteriler = new JButton("Evl\u0259r");
		btnMusteriler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Evler evler = new Evler();
				evler.setVisible(true);
			}
		});
		btnMusteriler.setBounds(20, 115, 109, 40);
		frame.getContentPane().add(btnMusteriler);
	}
}
