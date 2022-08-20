package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Dinesh Kumar");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void studentId() {
		System.out.println("14622");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		

	}

}
