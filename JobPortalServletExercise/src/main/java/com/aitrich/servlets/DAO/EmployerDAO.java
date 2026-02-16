package com.aitrich.servlets.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.aitrich.servlets.Entity.Employer;
import com.mysql.cj.xdevapi.StreamingDocResultBuilder;

public class EmployerDAO {
	
	
	String dbURL = "jdbc:mysql://localhost:3306/servlet_db";
	String dbUser = "root";
	String dbPass = "AbiMySQL678";
	
	public void addEmployer(Employer emp) throws ClassNotFoundException {
	try(Connection conn = DriverManager.getConnection(dbURL,dbUser,dbPass)){
		String query = "INSERT INTO employer VALUES(?,?,?)";
		PreparedStatement psmt = conn.prepareStatement(query);
		psmt.setInt(1, emp.getId());
		psmt.setString(2, emp.getCompanyName());
		psmt.setString(3, emp.getEmail());
		int rows = psmt.executeUpdate();
		System.out.println(rows +  " rows affected");
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	 public Employer getEmployerById(int id) {
	        Employer emp = null;

	        String sql = "SELECT * FROM employer WHERE id=?";

	        try {
	            Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, id);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                emp = new Employer();
	                emp.setId(rs.getInt("id"));
	                emp.setCompanyName(rs.getString("company_name"));
	                emp.setEmail(rs.getString("email"));
	            }

	            conn.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return emp;
	    }
	
	public ArrayList<Employer> showAllEmployee() {

	    ArrayList<Employer> employerList = new ArrayList<>();

	    try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass)) {

	        String query = "SELECT * FROM employer";
	        PreparedStatement psmt = conn.prepareStatement(query);
	        ResultSet rs = psmt.executeQuery();

	        while (rs.next()) {

	            Employer emp = new Employer(); 

	            emp.setId(rs.getInt("id"));
	            emp.setCompanyName(rs.getString("company_name"));
	            emp.setEmail(rs.getString("email"));

	            employerList.add(emp);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return employerList; 
	}
	public void updateEmployer(Employer emp) {
		try(Connection conn = DriverManager.getConnection(dbURL,dbUser,dbPass)){
			String query = "update employer set company_name=? , email=? where id=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			 psmt.setString(1, emp.getCompanyName());
		     psmt.setString(2, emp.getEmail());
		     psmt.setInt(3, emp.getId());
			int rows = psmt.executeUpdate();
			System.out.println(rows + " rows affected");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployerById(int id) {
		Employer emp =null;
		try(Connection conn = DriverManager.getConnection(dbURL,dbUser,dbPass)){
			String qeury = "delete from employer where id = ?";
			PreparedStatement psmt = conn.prepareStatement(qeury);
			psmt.setInt(1, id);
			int rows = psmt.executeUpdate();
			System.out.println(rows + " rows affected");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}