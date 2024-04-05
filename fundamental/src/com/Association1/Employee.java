package com.Association1;

public class Employee {
	String eid; 
	String ename; 
	String eaddr; 
	Account acc; 
	Employee(String eid,String ename,String eaddr,Account acc){ 
		this.eid=eid; 
		this.ename=ename; 
		this.eaddr=eaddr; 
		this.acc=acc; 
		}
	
	public void getEmployee(){ 
		System.out.println("Employee Details"); 
		System.out.println("-----------------"); 
		System.out.println("Employee Id :"+eid); 
		System.out.println("Employee Name :"+ename); 
		System.out.println("Employee Address :"+eaddr); 
		System.out.println();
		System.out.println("Account Details"); 
		System.out.println("----------------"); 
		System.out.println("Account Number :"+acc.accNo); 
		System.out.println("Account Name :"+acc.accName); 
		System.out.println("Account Type :"+acc.accType); 
}

}