package com.abstract3;

public class AccountsDepartment extends Employee{

	
	public AccountsDepartment(int eno, String ename, String dname) {
		super(eno, ename, dname);
		// TODO Auto-generated constructor stub
	}

	int CalculateSalary(String dname) {
		return 50000;
	}
	
}
