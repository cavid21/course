package course_VA;

import java.sql.*;

import javax.swing.JOptionPane;

public class Driver {
	public static Connection connector(){
		try{
			Class.forName("org.sqlite.JDBC");
			Connection myConn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Cavid/Desktop/Vusal_kurs_isi/mydb.sqlite");
			return myConn;
			}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "uqursuz");
			return null;
		}
	}
}
