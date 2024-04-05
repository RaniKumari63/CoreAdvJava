package com.Association1;

public class OnetoOneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account("abc123","Durga N","Savings"); 
		Employee emp=new Employee("E-111","Durga","Hyd",acc); 
		emp.getEmployee();
	}

}
