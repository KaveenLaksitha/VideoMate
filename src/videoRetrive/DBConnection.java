package videoRetrive;

import java.sql.*;

public class DBConnection {
	static Connection con=null;
	
public static Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/videos", "root", "root1234");
	} catch (Exception e) {
		System.out.println(e);
	}
	return con;
}

}
