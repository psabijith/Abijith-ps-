package com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import com.hospital.exception.PatientNotFoundException;
import com.hospital.model.Patient;
import com.hospital.util.DBUtil;

public class PatientDAO {
	Patient patient = new Patient();
	
	public void addPatient(Patient patient) {
		Connection conn = DBUtil.getConnection();
		String query = "INSERT INTO patients VALUES(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			int id =(int)(Math.random()*100000);
			 ps.setInt(1,id);
			patient.setId(id);
			ps.setString(2, patient.getName());
			ps.setString(3, patient.getPhone());
			ps.setString(4,patient.getEmail());
			ps.setTimestamp(5,Timestamp.valueOf(LocalDateTime.now()));
			
			int rows = ps.executeUpdate();
			System.out.println(rows + " rows updated");
			System.out.println("Patient " + patient.getName() + " successfully added \n Your patient ID : " + patient.getId() );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getPatientById(int id) {
		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM patients WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("Patient ID: " + rs.getInt("id") +
								   " | Patient Name: " + rs.getString("name") + 
								   " | Phone number: " + rs.getString("phone") +
								   " | Email: " + rs.getString("email") + 
								   " | Created At: " + rs.getTimestamp("CreatedAt")
						);
			}
			else {
				throw new PatientNotFoundException("Patient with ID " + id + " not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getPatientByPhone(String phone) {
		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM patients WHERE phone = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, phone);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("Patient ID: " + rs.getInt("id") +
								   " | Patient Name: " + rs.getString("name") + 
								   " | Phone number: " + rs.getString("phone") +
								   " | Email: " + rs.getString("email") + 
								   " | Created At: " + rs.getTimestamp("CreatedAt")
						);
			}
			else {
				throw new PatientNotFoundException("Patient with phone number " + phone + " not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getAllPatient(){
		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM patients";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			boolean found = false;
			while (rs.next()) {
	            found = true;
				System.out.println("Patient ID: " + rs.getInt("id") +
								   " | Patient Name: " + rs.getString("name") + 
								   " | Phone number: " + rs.getString("phone") +
								   " | Email: " + rs.getString("email") + 
								   " | Created At: " + rs.getTimestamp("CreatedAt")
						);
			}
			if(!found) {
				throw new PatientNotFoundException("No patients found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removePatient(int id) {
		Connection conn = DBUtil.getConnection();
		String query = "DELETE FROM patients WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			System.out.println( rows +" rows affected");
			System.out.println("Patient with ID " + id + " removed");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
