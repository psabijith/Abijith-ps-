package com.aitrich.JDBC.problem1;

import java.util.Scanner;

import com.aitrich.JDBC.problem1.DAO.EmployeeDAO;
import com.aitrich.JDBC.problem1.Domain.Employee;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDAO emp = new EmployeeDAO();
		int choice = 0;
		
		System.out.println("Welcome to Employee Management App");
		System.out.println("----------------------------------");
		
		
		Scanner sc = new Scanner(System.in);

		while (choice != 11) {
			System.out.println("1.Add Employee");
			System.out.println("2.View All Employees");
			System.out.println("3.View Employee by ID");
			System.out.println("4.Update Employee");
			System.out.println("5.Delete Employee");
			System.out.println("6.Filter by Department");
			System.out.println("7.Filter by Salary Range");
			System.out.println("8.Search by Name");
			System.out.println("9.View Active Employees");
			System.out.println("10.Filter by Hiring date");
			System.out.println("11.Exit");
		    System.out.println("Enter your choice:");
		    choice = Integer.parseInt(sc.nextLine());

		    switch (choice) {

		        case 1 :
		        {
		            System.out.print("Enter employee Id: ");
		            int empId = Integer.parseInt(sc.nextLine());

		            System.out.print("Enter first name: ");
		            String empFirstName = sc.nextLine();

		            System.out.print("Enter last name: ");
		            String empLastName = sc.nextLine();

		            System.out.print("Enter email: ");
		            String empEmail = sc.nextLine();

		            System.out.print("Enter phone number: ");
		            String empPhone = sc.nextLine();

		            System.out.print("Enter department: ");
		            String empDept = sc.nextLine();

		            System.out.print("Enter salary: ");
		            double empSalary = Double.parseDouble(sc.nextLine());

		            System.out.print("Enter hire date (YYYY-MM-DD): ");
		            String empHireDate = sc.nextLine();

		            System.out.print("Is active (true/false): ");
		            boolean empStatus = Boolean.parseBoolean(sc.nextLine());

		            Employee e = new Employee(
		                    empId, empFirstName, empLastName,
		                    empEmail, empPhone, empDept,
		                    empSalary, empHireDate, empStatus
		            );

		            emp.addEmployee(e);
		            break;
		        }
		            
		        case 2:{
		        	
		        	emp.getAllEmployees();
		        	break;
		        }
		        case 3:{
		        
		        	System.out.println("Enter employee Id:");
		        	int empId = Integer.parseInt(sc.nextLine());
		        	emp.getEmployeeById(empId);
		        	break;
		        }
		        case 4:{
		        	 System.out.print("Enter employee Id to update: ");
			            int empId = Integer.parseInt(sc.nextLine());

			            System.out.print("Enter first name: ");
			            String empFirstName = sc.nextLine();

			            System.out.print("Enter last name: ");
			            String empLastName = sc.nextLine();

			            System.out.print("Enter email: ");
			            String empEmail = sc.nextLine();

			            System.out.print("Enter phone number: ");
			            String empPhone = sc.nextLine();

			            System.out.print("Enter department: ");
			            String empDept = sc.nextLine();

			            System.out.print("Enter salary: ");
			            double empSalary = Double.parseDouble(sc.nextLine());

			            System.out.print("Enter hire date (YYYY-MM-DD): ");
			            String empHireDate = sc.nextLine();

			            System.out.print("Is active (true/false): ");
			            boolean empStatus = Boolean.parseBoolean(sc.nextLine());

			            Employee e = new Employee(
			                    empId, empFirstName, empLastName,
			                    empEmail, empPhone, empDept,
			                    empSalary, empHireDate, empStatus
			            );
			            emp.updateEmployee(e);
			            break;
		        }
		        case 5:{
		        	System.out.println("Enter id of employee to delete:");
		        	int empId = Integer.parseInt(sc.nextLine());
		        	
		        	emp.deleteEmployee(empId);
		        	break;
		        }
		        case 6:{
		        	System.out.println("Enter department:");
		        	String empDept = sc.nextLine();
		        	
		        	emp.getEmployeeByDepartment(empDept);
		        	break;
		    }
		    case 7 :{
		    	System.out.println("Enter minimum salary:");
		    	double minSal = Double.parseDouble(sc.nextLine());
		    	System.out.println("Enter maximum salary:");
		    	double maxSal = Double.parseDouble(sc.nextLine());
		    	
		    	emp.getEmployeesBySalaryRange(minSal, maxSal);
		    	break;
		    }
		    case 8:{
		    	System.out.println("Enter first name or last name of the employee:");
		    	String empName = sc.nextLine();
		    	
		    	emp.searchEmployeesByName(empName);
		    	break;
		    }
		    case 9:{
		    	System.out.println("All active employees :\n");
		    	emp.getActiveEmployees();
		    	break;
		    }
		    case 10:{
		    	System.out.println("Enter date:");
		    	String date = sc.nextLine();
		    	emp.getEmployeesHiredAfter(date);
		    	break;
		    }
		    case 11:{
		    	System.out.println("EXITING...");
		    	break;
		    }
		    default :{
		    	System.out.println("Enter a valid choice");
		    }
		    
		    }	
		}

		sc.close();
	}
}
