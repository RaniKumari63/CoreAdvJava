package com.Association1;

public class Student1 {

	String sid;
	String sname;
	String saddr;
	Course[] crs;
	public Student1(String sid, String sname, String saddr, Course[] crs) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.crs = crs;
	}

	public void getStudentDetails(){ 
		System.out.println("Student Details"); 
		System.out.println("----------------"); 
		System.out.println("Student Id :"+sid); 
		System.out.println("Student name :"+sname); 
		System.out.println("Student Address:"+saddr); 
		System.out.println("CID CNAME CCOST"); 
		System.out.println("----------------------"); 
		for(int i=0;i<crs.length;i++){ 
		Course c=crs[i]; 
		System.out.println(c.cid+" "+c.cname+" "+c.ccost); 
}
	System.out.println();}
}
