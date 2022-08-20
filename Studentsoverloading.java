package org.studentoveriding;

public class Studentsoverloading {
	public void getStudentInfo(int id){
		System.out.println("Student ID= " + id);		
		
	}
	public void getStudentInfo(String name){
		System.out.println("Student Name= " + name);		
		
	}
	public void getStudentInfo(String email, String phonenumber){
		System.out.println("Student Email= " + email);	
		System.out.println("Student Phone number= " + phonenumber);
		
	}
	public static void main(String[] args) {
		Studentsoverloading s1 = new Studentsoverloading();
		s1.getStudentInfo(35);
		s1.getStudentInfo("Dineshkumar");
		s1.getStudentInfo("dinesh007@gmail.com", "78545215235");
		
		
	}

}
