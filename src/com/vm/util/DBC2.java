package com.vm.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBC2 {
	static Connection con=null;
	
public static Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/subscription", "root", "root1234");
	} catch (Exception e) {
		System.out.println(e);
	}
	return con;
}

}