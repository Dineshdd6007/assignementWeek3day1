package org.studentoveriding;

public class Department extends Departmentparent {
	public void maths() {
		super.maths();
		System.out.println("Maths Dept");
		
	}
	public void computer() {
		System.out.println("Computer Dept");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department D1 = new Department();
		D1.maths();
		D1.computer();

	}

}
