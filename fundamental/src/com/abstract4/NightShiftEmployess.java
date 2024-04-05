package com.abstract4;

public class NightShiftEmployess extends Employee {
double extraallowance=1000;
NightShiftEmployess()
{
	
}
	
double CalcSalary()
		{ 
			final double sal=getBasic()+getAllowance()+extraallowance-getDeductions();
			
			return sal;
		}

public NightShiftEmployess(int empId, double basic, double allowance, double deductions, String firstName,
		String lastName, String address, String pincode, String realName) {
	super(empId, basic, allowance, deductions, firstName, lastName, address, pincode, realName);
	// TODO Auto-generated constructor stub
}
	}


