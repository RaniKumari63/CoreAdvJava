package com.abstract4;

import java.util.Scanner;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname;
		String lastname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmpId");
		int emid=sc.nextInt();
		System.out.println("Enter Basic ");
		double basic=sc.nextDouble();
		System.out.println("Enter Allowances");
		double allowances=sc.nextDouble();
		System.out.println("Enter Deductions");
		double deductions=sc.nextDouble();
		System.out.println("Enter FirstName");
		 firstname=sc.next();
		System.out.println("Enter LastName");
		 lastname=sc.next();
		String realname=firstname+lastname;
		while(realname.length()<0)
		{ System.out.println("Firstname and Lastname should be more than 0");
			System.out.println("Enter FirstName ");
			 firstname=sc.next();
			System.out.println("Enter LastName");
			 lastname=sc.next();	
		}
		System.out.println("Enter Address");
		String add=sc.next();
		System.out.println("Enter Pincode");
		String pincode=sc.next();
		System.out.println("Enter EmployeeType PTE,FTE,NSE,M");
		String emptype=sc.next();
		
		if(emptype.equalsIgnoreCase("PTE"))
		{
			PartTimeEmployee pe=new PartTimeEmployee(emid,basic,allowances,deductions,firstname,lastname,add,pincode,realname);
			double salary=pe.CalcSalary();
System.out.println(pe.getEmpId()+"\t"+pe.getRealName()+"\t"+pe.getAddress()+"\t"+pe.getPincode()+"\t"+pe.getRealName()+"\t"+salary);
		}
		
		else if(emptype.equalsIgnoreCase("FTE"))
		{
			FullTimeEmployee fe=new FullTimeEmployee(emid,basic,allowances,deductions,firstname,lastname,add,pincode,realname);
			double salary=fe.CalcSalary();
System.out.println(fe.getEmpId()+"\t"+fe.getRealName()+"\t"+fe.getAddress()+"\t"+fe.getPincode()+"\t"+fe.getRealName()+"\t"+salary);
		}
		else if(emptype.equalsIgnoreCase("NSE"))
		{
			NightShiftEmployess ne=new NightShiftEmployess(emid,basic,allowances,deductions,firstname,lastname,add,pincode,realname);
			double salary=ne.CalcSalary();
System.out.println(ne.getEmpId()+"\t"+ne.getRealName()+"\t"+ne.getAddress()+"\t"+ne.getPincode()+"\t"+ne.getRealName()+"\t"+salary);
		}
		if(emptype.equalsIgnoreCase("M"))
		{
			Manager m=new Manager(emid,basic,allowances,deductions,firstname,lastname,add,pincode,realname);
			double salary=m.CalcSalary();
System.out.println(m.getEmpId()+"\t"+m.getRealName()+"\t"+m.getAddress()+"\t"+m.getPincode()+"\t"+m.getRealName()+"\t"+salary);
		}
		
	}

	}

