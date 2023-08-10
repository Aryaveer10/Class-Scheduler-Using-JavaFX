package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connectionclass1 {
	
	public static Connection getConnection() throws SQLException {
		String dbname="tutorial";
		String username="root";
		String password="";
		
		
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/"+dbname,username,password);

		return connection;
		
	}

}
