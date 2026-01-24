package com.hospital.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String url = "jdbc:mysql://localhost:3306/hospital_management_system_db";
	private static final String username = "root";
	private static final String password = "AbiMySQL678";
	
	public static Connection getConnection() {
	    try {
	    	Connection conn = DriverManager.getConnection(url, username, password);
	        return conn;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
}