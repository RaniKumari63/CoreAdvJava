package com.abstract3;

import java.util.Scanner;

public class EmployeeClient {
static int salary=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter eno");
int eno=sc.nextInt();
System.out.println("Enter ename");
String ename=sc.next();
System.out.println("Enter dname ACC,IT,HR");
String dname=sc.next();
if(dname.equals("ACC"))
{
	 AccountsDepartment ad=new AccountsDepartment(eno,ename,dname);
	 salary=ad.CalculateSalary("ACC");
	 System.out.println(ad.getEno()+"\t"+ad.getEname()+"\t"+ad.getDname()+"\t"+salary);
	
}
else if(dname=="IT")
{
	ItDepartment itd=new ItDepartment(eno,ename,dname);
	salary=itd.CalculateSalary("IT");
	System.out.println(itd.getEno()+"\t"+itd.getEname()+"\t"+itd.getDname()+"\t"+salary);
	
	
}
else if(dname=="HR")
{
	HrDepartment hd=new HrDepartment(eno,ename, dname);
	salary=hd.CalculateSalary("HR");
	System.out.println(hd.getEno()+"\t"+hd.getEname()+"\t"+hd.getDname()+"\t"+salary);
}
	}

}
