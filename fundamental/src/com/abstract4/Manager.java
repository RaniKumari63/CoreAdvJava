package com.abstract4;

public class Manager extends Employee {
double nightshiftallowances=2000;
	
	public Manager(int empId, double basic, double allowance, double deductions, String firstName, String lastName,
		String address, String pincode, String realName) {
	super(empId, basic, allowance, deductions, firstName, lastName, address, pincode, realName);
	// TODO Auto-generated constructor stub
}

	Manager()
	{
		
	}
	
		double CalcSalary()
		{ 
			final double sal=getBasic()+getAllowance()+nightshiftallowances-getDeductions();
			
			return sal;
		}
		
		
		
	

}
