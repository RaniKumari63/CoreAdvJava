package com.constructor;

public class Employee3 {

	String eid;
	String ename;
	float esal;
	String eaddr;
	Employee3(String eid,String ename,float esal,String eaddr)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
		this.eaddr=eaddr;
	}
	
	public void getEmpDetails()
	{
		System.out.println("employee details");
		System.out.println("-----------------");
		System.out.println("Employee id :"+eid);
		System.out.println("Employeename:"+ename);
		System.out.println("Employeesalary:"+esal);
		System.out.println("EmployeeAddress:"+eaddr);
	}
}
