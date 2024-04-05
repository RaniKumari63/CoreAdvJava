package com.inheritance1;

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Manager m=new Manager("E-111","AAA","Hyd");
			m.getManagerDetails();
			System.out.println();
			Accountant acc=new Accountant("E-222","BBB","Hyd"); acc.getAccountantDetails(); 
	}

}
