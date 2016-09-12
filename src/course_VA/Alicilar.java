package course_VA;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.sqlite.*;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alicilar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alicilar frame = new Alicilar();
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
	private JTable table;
	private JButton btnGeri;
	public Alicilar() {
		conn = Driver.connector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlclar = new JButton("Sat\u0131c\u0131lar");
		btnAlclar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "Select * from saticilar";
					PreparedStatement pst = (PreparedStatement) conn.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAlclar.setBounds(122, 0, 174, 23);
		contentPane.add(btnAlclar);
		
		table = new JTable();
		table.setBounds(0, 23, 434, 237);
		contentPane.add(table);
		
		btnGeri = new JButton("geri");
		btnGeri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Table_1 window = new Table_1();
				window.frame.setVisible(true);
			}
		});
		btnGeri.setBounds(376, 0, 58, 23);
		contentPane.add(btnGeri);
	}

}
