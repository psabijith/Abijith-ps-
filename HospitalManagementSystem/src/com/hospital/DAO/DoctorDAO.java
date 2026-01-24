package com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hospital.exception.DoctorNotFoundException;
import com.hospital.exception.PatientNotFoundException;
import com.hospital.model.Doctor;
import com.hospital.util.DBUtil;

public class DoctorDAO {
	
	Doctor doctor = new Doctor();
	
	public void addDoctor(Doctor doctor) {
		Connection conn = DBUtil.getConnection();
		try {
			String query = "INSERT INTO doctors VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			int id = (int)(Math.random()*100000);
			ps.setInt(1, id);
			doctor.setId(id);
			ps.setString(2, doctor.getName());
			ps.setString(3, doctor.getSpecialization());
			int rows = ps.executeUpdate();
			System.out.println(rows + " rows affected");
			System.out.println(doctor.getName() + " added !");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getDoctorById(int id) {
		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM doctors WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("|Doctor ID: " + rs.getInt("id") +
						   "|Doctor Name: " + rs.getString("name") + 
						   "|Specialization: " + rs.getString("specialization")
				);
			}
			else {
				throw new DoctorNotFoundException("Doctor with ID " + id + " not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getDoctorBySpecialization(String specialization){
		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM doctors WHERE specialization = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, specialization);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("|Doctor ID: " + rs.getInt("id") +
						   "|Doctor Name: " + rs.getString("name") + 
						   "|Specialization: " + rs.getString("specialization")
				);
			}
			else {
				throw new PatientNotFoundException("Doctors specialized at " + specialization + " not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getAllDoctor(){
		Connection conn = DBUtil.getConnection();
		String query = "SELECT * FROM doctors";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			boolean found = false;
			while(rs.next()) {
				found = true;
				System.out.println("|Doctor ID: " + rs.getInt("id") +
								   "|Doctor Name: " + rs.getString("name") + 
								   "|Specialization: " + rs.getString("specialization")
						);
			}
			if(!found) {
				throw new DoctorNotFoundException("No Doctors found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removeDoctor(int id) {
		Connection conn = DBUtil.getConnection();
		String query = "DELETE FROM doctors WHERE id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			System.out.println( rows +" rows affected");
			System.out.println("Docotor with ID " + id + " removed");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
