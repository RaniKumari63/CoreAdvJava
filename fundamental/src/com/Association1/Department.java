package com.Association1;

public class Department {

	String did;
	String dname;
	Employee1[] emps;
	Department(String did,String dname,Employee1[] emps){
		this.did=did; 
		this.dname=dname; 
		this.emps=emps; 	
	}
	public void getDepartmentDetails(){ 
		System.out.println("Department Details"); 
		System.out.println("--------------------"); 
		System.out.println("Department Id :"+did); 
		System.out.println("Department Name:"+dname); 
		System.out.println(); 
		System.out.println("EID ENAME EADDR"); 
		System.out.println("----------------"); 
		for(int i=0;i<emps.length;i++){ 
		Employee1 e=emps[i]; 
		System.out.println(e.eid+" "+e.ename+" "+e.eaddr); 
		}
}
}

