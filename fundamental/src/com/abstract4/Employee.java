package com.abstract4;

public abstract class Employee {
private int EmpId;

private double Basic;
private double Allowance;
private double Deductions;

private String FirstName;
private String LastName;
private String Address;
private String Pincode;
private String RealName;
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public double getDeductions() {
	return Deductions;
}
public void setDeductions(double deductions) {
	Deductions = deductions;
}
public double getBasic() {
	return Basic;
}
public void setBasic(double basic) {
	Basic = basic;
}
public double getAllowance() {
	return Allowance;
}
public void setAllowance(double allowance) {
	Allowance = allowance;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getPincode() {
	return Pincode;
}
public void setPincode(String pincode) {
	Pincode = pincode;
}
public String getRealName() {
	return RealName;
}

abstract double CalcSalary();
Employee()
{
	
}
public Employee(int empId, double basic, double allowance, double deductions, String firstName, String lastName,
		String address, String pincode, String realName) {
	super();
	EmpId = empId;
	Basic = basic;
	Allowance = allowance;
	Deductions = deductions;
	FirstName = firstName;
	LastName = lastName;
	Address = address;
	Pincode = pincode;
	RealName = realName;
}

}
