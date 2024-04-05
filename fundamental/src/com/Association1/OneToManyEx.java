package com.Association1;

public class OneToManyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1("E-111","AAA","Hyd"); 
		Employee1 e2=new Employee1("E-222","BBB","Hyd"); 
		Employee1 e3=new Employee1("E-333","CCC","Hyd"); 
		Employee1[] emps=new Employee1[3]; 
		emps[0]=e1; 
		emps[1]=e2; 
		emps[2]=e3;
		Department dept=new Department("D-111","Admin",emps); 
		dept.getDepartmentDetails(); 
	}

}
