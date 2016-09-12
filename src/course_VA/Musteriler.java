package course_VA;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Musteriler extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Musteriler frame = new Musteriler();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	Connection conn = null; 
	private JButton btnGeri;
	public Musteriler() {
		conn = Driver.connector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 22, 434, 238);
		contentPane.add(table);
		
		JButton btnLoadTable = new JButton("Y\u00FCkl\u0259");
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "Select * from musteriler";
					PreparedStatement pst = (PreparedStatement) conn.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnLoadTable.setBounds(113, 0, 174, 23);
		contentPane.add(btnLoadTable);
		
		btnGeri = new JButton("geri");
		btnGeri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Table_1 window = new Table_1();
				window.frame.setVisible(true);
			}
		});
		btnGeri.setBounds(377, 0, 57, 23);
		contentPane.add(btnGeri);
	}
}
