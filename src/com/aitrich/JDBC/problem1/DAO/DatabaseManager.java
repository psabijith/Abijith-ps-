package com.aitrich.JDBC.problem1.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	
	private final String dbURL = "jdbc:mysql://localhost:3306/company_db";
	private final String dbUser = "root";
	private final String dbPass = "Kerivada@678";
	
	public String getDbURL() {
		return dbURL;
	}
	public String getDbUser() {
		return dbUser;
	}
	public String getDbPass() {
		return dbPass;
	}
	
	public Connection createMySQLConnection() {
		try{
			Connection conn = DriverManager.getConnection(dbURL , dbUser , dbPass);
			return conn;
		}catch(SQLException e) {
			e.getMessage();
		}
		return null;
	}
	
	public void CloseMySQLConnection(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.getMessage();
		}
	}
}
