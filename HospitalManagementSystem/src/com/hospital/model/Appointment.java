package com.hospital.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
	
	private int id;
	private int patientId;
	private int doctorId;
	private LocalDate appointmentDate;
	private LocalTime time;
	private AppointmentStatus status;
	
	public Appointment() {
		super();
	}
	
	public Appointment(int patientId, int doctorId, LocalDate appointmentDate, LocalTime time,
			AppointmentStatus status) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.time = time;
		this.status = status;
	}

	public Appointment(int id, int patientId, int doctorId, LocalDate appointmentDate, LocalTime time, AppointmentStatus status) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentDate = appointmentDate;
		this.time = time;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public AppointmentStatus getStatus() {
		return status;
	}

	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patientId=" + patientId + ", doctorId=" + doctorId + ", appointmentDate="
				+ appointmentDate + ", Time=" + time + ", status=" + status + "]";
	}
	
	
}
