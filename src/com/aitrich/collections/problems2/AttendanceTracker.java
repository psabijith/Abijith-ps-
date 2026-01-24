package com.aitrich.collections.problems2;

import java.util.TreeSet;

public class AttendanceTracker {
	TreeSet<Student> students = new TreeSet<>( (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
	int count = 0;
	
	public void markAttendance(Student student) {
		if(students.contains(student)) {
			System.out.println(student +" already added!");
		}
		else {
			students.add(student);
			count++;
		}
	}
	public void isPresent(int studentId) {
	    if (students.isEmpty()) {
	        System.out.println("No students found!.The list is empty.");
	        return; 
	    }

	    Student[] studentArray = students.toArray(new Student[count]);

	    for (int i = 0; i < count; i++) {
	        if (studentArray[i].getId() == studentId) {
	            System.out.println("Student with Id " + studentId + " is present: " + " \n" + studentArray[i]);
	            return;
	        }
	    }
	}
	public void getTotalPresent() {
		System.out.println("Total students present: " + count);
	}
	public void getAttendanceList() {
		System.out.println("All available students:");
		System.out.println("------------------------");
		System.out.println(students);
	}
}
