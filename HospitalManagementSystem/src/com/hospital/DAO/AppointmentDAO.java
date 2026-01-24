package com.hospital.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import com.hospital.exception.SlotUnavailableException;
import com.hospital.model.Appointment;
import com.hospital.util.DBUtil;

public class AppointmentDAO {

	public void bookAppointment(Appointment appointment)
	        throws SlotUnavailableException {

	    try {
	        boolean available = isSlotAvailable(
	                appointment.getDoctorId(),
	                appointment.getAppointmentDate(),
	                appointment.getTime()
	        );

	        if (!available) {
	            throw new SlotUnavailableException("Slot unavailable.");
	        }

	        String query = "INSERT INTO appointments (id, patientId, doctorId, appointmentDate, time, appointmentStatus) VALUES (?, ?, ?, ?, ?, ?)";

	        try (Connection conn = DBUtil.getConnection();
	             PreparedStatement ps = conn.prepareStatement(query)) {

	            int id = (int) (Math.random() * 100000);
	            appointment.setId(id);

	            ps.setInt(1, id);
	            ps.setInt(2, appointment.getPatientId());
	            ps.setInt(3, appointment.getDoctorId());
	            ps.setDate(4, Date.valueOf(appointment.getAppointmentDate()));
	            ps.setTime(5, Time.valueOf(appointment.getTime()));
	            ps.setString(6, appointment.getStatus().name());

	            ps.executeUpdate();
	            System.out.println("Appointment booked successfully");
	        }

	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	}


    public void cancelAppointment(int id) {

        String query = "DELETE FROM appointments WHERE id = ?";

        try { 
        	Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows == 0) {
                throw new SlotUnavailableException(
                    "Appointment with ID " + id + " not found"
                );
            }

            System.out.println("Appointment canceled");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isSlotAvailable(int doctorId, LocalDate date, LocalTime time) throws SQLException {

        String query = " SELECT 1 FROM appointments WHERE doctorId = ? AND appointmentDate = ? AND time >= ? AND time < ? ";

        LocalTime endTime = time.plusMinutes(10);

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, doctorId);
            ps.setDate(2, Date.valueOf(date));
            ps.setTime(3, Time.valueOf(time));
            ps.setTime(4, Time.valueOf(endTime));

            try (ResultSet rs = ps.executeQuery()) {
                return !rs.next();
            }
        }
    }


    public void getAppointmentByDoctor(int doctorId, LocalDate date) {

        String query =
            "SELECT * FROM appointments WHERE doctorId = ? AND appointmentDate = ?";

        try {
        	 Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, doctorId);
            ps.setDate(2, Date.valueOf(date));

            ResultSet rs = ps.executeQuery();
            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println(
                    "Appointment ID: " + rs.getInt("id") +
                    " | Patient ID: " + rs.getInt("patientId") +
                    " | Time: " + rs.getTime("time") +
                    " | Status: " + rs.getString("appointmentStatus")
                );
            }

            if (!found) {
                throw new SlotUnavailableException(
                    "No appointments for doctor " + doctorId + " on " + date
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAppointmentByPatient(int patientId) {

        String query =
            "SELECT * FROM appointments WHERE patientId = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println(
                    "Appointment ID: " + rs.getInt("id") +
                    " | Doctor ID: " + rs.getInt("doctorId") +
                    " | Date: " + rs.getDate("appointmentDate") +
                    " | Time: " + rs.getTime("time") +
                    " | Status: " + rs.getString("appointmentStatus")
                );
            }

            if (!found) {
                throw new SlotUnavailableException(
                    "No appointments found for patient " + patientId
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
