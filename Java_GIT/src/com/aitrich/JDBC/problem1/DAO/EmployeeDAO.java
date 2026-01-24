package com.aitrich.JDBC.problem1.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aitrich.JDBC.problem1.Domain.Employee;

public class EmployeeDAO {
	
	DatabaseManager dbManager = new DatabaseManager();
	
	public EmployeeDAO() {}
	
	public void addEmployee(Employee employee) {
		
		String query = "INSERT INTO employees (id , first_name , last_name , email , phone ,department , salary ,hire_date , is_active) VALUES (?,?,?,?,?,?,?,?,?)";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL(),dbManager.getDbUser() ,dbManager.getDbPass());
			PreparedStatement pstmt = conn.prepareStatement(query)){
			pstmt.setInt(1, employee.getEmployeeId());
			pstmt.setString(2 , employee.getFirstName());
			pstmt.setString(3 , employee.getLastName());
			pstmt.setString(4 , employee.getEmail());
			pstmt.setString(5 , employee.getPhone());
			pstmt.setString(6 , employee.getDepartment());
			pstmt.setDouble(7 , employee.getSalary());
			pstmt.setString(8 , employee.getHireDate());
			pstmt.setBoolean(9 , employee.getStatus());
			
			System.out.println("addEmployee() called");
			
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " rows affected");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getEmployeeById(int id) {
		
		String query = "SELECT * FROM employees WHERE id = ?";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() ,dbManager.getDbPass());
			PreparedStatement ps = conn.prepareStatement(query)){
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			 if (rs.next()) {
		            System.out.println(
		                "ID: " + rs.getInt("id") +
		                ", First Name: " + rs.getString("first_name") +
		                ", Last Name: " + rs.getString("last_name") +
		                ", Email: " + rs.getString("email") +
		                ", Phone: " + rs.getString("phone") +
		                ", Department: " + rs.getString("department") +
		                ", Salary: " + rs.getDouble("salary") +
		                ", Hire Date: " + rs.getDate("hire_date") +
		                ", Active: " + rs.getBoolean("is_active")
		            );
		        } else {
		            System.out.println("No employee found with ID " + id);
		        }
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getAllEmployees() {
		String query = "SELECT * FROM employees";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL(),dbManager.getDbUser() ,dbManager.getDbPass());
				PreparedStatement ps = conn.prepareStatement(query)){
			
			ps.executeQuery();
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(
						"ID: " + rs.getInt("id") +
		                ", First Name: " + rs.getString("first_name") +
		                ", Last Name: " + rs.getString("last_name") +
		                ", Email: " + rs.getString("email") +
		                ", Phone: " + rs.getString("phone") +
		                ", Department: " + rs.getString("department") +
		                ", Salary: " + rs.getDouble("salary") +
		                ", Hire Date: " + rs.getDate("hire_date") +
		                ", Active: " + rs.getBoolean("is_active")
						);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateEmployee(Employee employee) {
		
		String query = "UPDATE employees SET  first_name = ? , last_name = ? , email = ? , phone = ? , department = ? , salary = ? , hire_date = ? , is_active = ? WHERE id = ?" ;
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() , dbManager.getDbPass());
			PreparedStatement ps = conn.prepareStatement(query)){
			ps.setString(1 , employee.getFirstName());
			ps.setString(2 , employee.getLastName());
			ps.setString(3 , employee.getEmail());
			ps.setString(4 , employee.getPhone());
			ps.setString(5 , employee.getDepartment());
			ps.setDouble(6 , employee.getSalary());
			ps.setString(7 , employee.getHireDate());
			ps.setBoolean(8 , employee.getStatus());
			ps.setInt(9,employee.getEmployeeId());
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				System.out.println(rows + " Affected");
			}
			else {
				System.out.println("No employee found!");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int id) {
		String query = "DELETE FROM employees WHERE id = ?";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() , dbManager.getDbPass());
			PreparedStatement ps = conn.prepareStatement(query)){
			ps.setInt(1, id);
			
			int rows = ps.executeUpdate();
			System.out.println( rows + " rows affected");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getEmployeeByDepartment(String dept) {
		String query = "SELECT * FROM employees WHERE department = ?";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() , dbManager.getDbPass());
			PreparedStatement ps = conn.prepareStatement(query)){
			ps.setString(1, dept);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(
						"ID: " + rs.getInt("id") +
		                ", First Name: " + rs.getString("first_name") +
		                ", Last Name: " + rs.getString("last_name") +
		                ", Email: " + rs.getString("email") +
		                ", Phone: " + rs.getString("phone") +
		                ", Department: " + rs.getString("department") +
		                ", Salary: " + rs.getDouble("salary") +
		                ", Hire Date: " + rs.getDate("hire_date") +
		                ", Active: " + rs.getBoolean("is_active"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getEmployeesBySalaryRange(double minSalary, double maxSalary) {
		String query = "SELECT * FROM employees WHERE salary BETWEEN ? AND ?";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() , dbManager.getDbPass());
			PreparedStatement ps = conn.prepareStatement(query)){
			ps.setDouble(1, minSalary);
			ps.setDouble(2, maxSalary);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(
						"ID: " + rs.getInt("id") +
						", First Name: " + rs.getString("first_name")+
						", Last Name: " + rs.getString("last_name")+
						", Email: " + rs.getString("email") +
						", Phone: "+ rs.getString("phone") + 
						", Department: " + rs.getString("department") +
						", Salary: " +rs.getDouble("salary") +
						", Hire Date: " + rs.getString("hire_date") +
						", Active: " + rs.getBoolean("is_active")
						);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getActiveEmployees() {
		String query = "SELECT * FROM  employees WHERE is_active = 1";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() , dbManager.getDbPass());
				PreparedStatement ps = conn.prepareStatement(query)){
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					System.out.println(
							"ID: " + rs.getInt("id") +
							", First Name: " + rs.getString("first_name")+
							", Last Name: " + rs.getString("last_name")+
							", Email: " + rs.getString("email") +
							", Phone: "+ rs.getString("phone") + 
							", Department: " + rs.getString("department") +
							", Salary: " +rs.getDouble("salary") +
							", Hire Date: " + rs.getString("hire_date") +
							", Active: " + rs.getBoolean("is_active")
							);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
	}
	
	public void searchEmployeesByName(String searchTerm) {
		String query = "SELECT * FROM employees WHERE first_name = ? OR last_name = ?";
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() , dbManager.getDbPass());
				PreparedStatement ps = conn.prepareStatement(query)){
				ps.setString(1, searchTerm);
				ps.setString(2, searchTerm);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					System.out.println(
							"ID: " + rs.getInt("id") +
							", First Name: " + rs.getString("first_name")+
							", Last Name: " + rs.getString("last_name")+
							", Email: " + rs.getString("email") +
							", Phone: "+ rs.getString("phone") + 
							", Department: " + rs.getString("department") +
							", Salary: " +rs.getDouble("salary") +
							", Hire Date: " + rs.getString("hire_date") +
							", Active: " + rs.getBoolean("is_active")
							);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
	}
	
	public void getEmployeesHiredAfter(String date) {
		String query = "SELECT * FROM employees WHERE hire_date > ?";
		
		try(Connection conn = DriverManager.getConnection(dbManager.getDbURL() , dbManager.getDbUser() , dbManager.getDbPass());
				PreparedStatement ps = conn.prepareStatement(query)){
				ps.setString(1, date);
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					System.out.println(
							"ID: " + rs.getInt("id") +
							", First Name: " + rs.getString("first_name")+
							", Last Name: " + rs.getString("last_name")+
							", Email: " + rs.getString("email") +
							", Phone: "+ rs.getString("phone") + 
							", Department: " + rs.getString("department") +
							", Salary: " +rs.getDouble("salary") +
							", Hire Date: " + rs.getString("hire_date") +
							", Active: " + rs.getBoolean("is_active")
							);
				}
			}catch(SQLException e) {
				e.printStackTrace();
		}
	}
}
