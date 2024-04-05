package com.abstract4;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode, String realName) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode, realName);
		// TODO Auto-generated constructor stub
	}
	 double CalcSalary()
	 {
		 
		 final double sal=getBasic()+getAllowance()-getDeductions();
	return sal;
	 }
	
}
