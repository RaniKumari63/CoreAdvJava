package com.inheritance1;

public class Accountant extends Employee {

	Accountant (String eid1,String ename1,String eaddr1) {
		eid=eid1; 
		ename=ename1; 
		eaddr=eaddr1;
		}
	public void getAccountantDetails() {
		System.out.println("Accountant Details"); 
		System.out.println("--------------------");
		getEmpDetails();
		} 
}
