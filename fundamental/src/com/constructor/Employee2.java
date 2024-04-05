package com.constructor;

public class Employee2 {

	String eid;
	String ename;
	float esal;
	String eaddr;
	Employee2()
	{
		eid="E-111";
		ename="Durga";
		esal=50000.0f;
		eaddr="hyd";
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
