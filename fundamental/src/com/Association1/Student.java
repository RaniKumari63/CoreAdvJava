package com.Association1;

public class Student {
String sid;
String sname;
String saddr;
Branch branch;
public Student(String sid, String sname, String saddr, Branch branch) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.saddr = saddr;
	this.branch = branch;
}
public void getStudentDetails(){ 
System.out.println("Student Details"); 
System.out.println("----------------"); 
System.out.println("Student Id :"+sid); 
System.out.println("Student name :"+sname); 
System.out.println("Student Address:"+saddr); 
System.out.println("Branch Id :"+branch.bid); 
System.out.println("Branch Name :"+branch.bname); 
System.out.println();
}
}
