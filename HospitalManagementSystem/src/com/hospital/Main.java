package com.hospital;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.hospital.DAO.AppointmentDAO;
import com.hospital.DAO.DoctorDAO;
import com.hospital.DAO.PatientDAO;
import com.hospital.model.Appointment;
import com.hospital.model.AppointmentStatus;
import com.hospital.model.Doctor;
import com.hospital.model.Patient;

public class Main {

    public static void main(String[] args) throws SQLException {

        PatientDAO patient = new PatientDAO();
        DoctorDAO doctor = new DoctorDAO();
        AppointmentDAO appointment = new AppointmentDAO();

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("WELCOME TO HOSPITAL");
        System.out.println("-------------------");

        while (choice != 16) {

            System.out.println("1.Add patient");
            System.out.println("2.Get patient by ID");
            System.out.println("3.Get patient by phone number");
            System.out.println("4.Get all patients");
            System.out.println("5.Remove patient");
            System.out.println("6.Add doctor");
            System.out.println("7.Get doctor by ID");
            System.out.println("8.Get doctor by Specialization");
            System.out.println("9.Get all doctor");
            System.out.println("10.Remove doctor");
            System.out.println("11.Book appointment");
            System.out.println("12.Cancel appointment");
            System.out.println("13.Is slot available");
            System.out.println("14.Get appointment by doctor");
            System.out.println("15.Get appointment by patient");
            System.out.println("16.Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    patient.addPatient(new Patient(pname, phone, email));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    patient.getPatientById(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter phone number: ");
                    patient.getPatientByPhone(sc.nextLine());
                    break;

                case 4:
                    patient.getAllPatient();
                    break;

                case 5:
                    System.out.print("Enter ID to remove: ");
                    patient.removePatient(sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter doctor name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter specialization: ");
                    String spec = sc.nextLine();

                    doctor.addDoctor(new Doctor(dname, spec));
                    break;

                case 7:
                    System.out.print("Enter ID: ");
                    doctor.getDoctorById(sc.nextInt());
                    break;

                case 8:
                    System.out.print("Enter specialization: ");
                    doctor.getDoctorBySpecialization(sc.nextLine());
                    break;

                case 9:
                    doctor.getAllDoctor();
                    break;

                case 10:
                    System.out.print("Enter ID to remove: ");
                    doctor.removeDoctor(sc.nextInt());
                    break;

                case 11:
                    System.out.print("Enter patient ID: ");
                    int pID = sc.nextInt();
                    System.out.print("Enter doctor ID: ");
                    int dID = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter date (yyyy-MM-dd): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    System.out.print("Enter time (HH:mm): ");
                    LocalTime time = LocalTime.parse(sc.nextLine());

                    Appointment ap = new Appointment(pID,dID,date,time,AppointmentStatus.BOOKED);

                    appointment.bookAppointment(ap);
                    break;

                case 12:
                    System.out.print("Enter appointment ID: ");
                    appointment.cancelAppointment(sc.nextInt());
                    break;

                case 13:
                    System.out.print("Enter doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter date (yyyy-MM-dd): ");
                    LocalDate d = LocalDate.parse(sc.nextLine());

                    System.out.print("Enter time (HH:mm): ");
                    LocalTime t = LocalTime.parse(sc.nextLine());

                    boolean available = appointment.isSlotAvailable(did, d, t);
                    System.out.println(available ? "Slot Available" : "Slot Not Available");
                    break;

                case 14:
                    System.out.print("Enter doctor ID: ");
                    int docId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter date (yyyy-MM-dd): ");
                    LocalDate adate = LocalDate.parse(sc.nextLine());

                    appointment.getAppointmentByDoctor(docId, adate);
                    break;

                case 15:
                    System.out.print("Enter patient ID: ");
                    appointment.getAppointmentByPatient(sc.nextInt());
                    break;

                case 16:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
