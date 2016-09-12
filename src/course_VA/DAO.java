package course_VA;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public static void main(String[] args) {
		
	}
	public static Connection getConnection() throws Exception{
		try{
			String driver = "com.mysql.jdbs.Driver";
			String url = "jdbc:mysql://24.196.52.166:3306/table1";
			String username = "hey";
			String password = "mypass";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("db connected");
			return conn;
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		return null;
	}
}
