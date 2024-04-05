package com.constructor;

public class Employee {
  int eno;
  String ename;
  String eadd;
  public Employee(int eno,String ename,String eadd)
  {
	  this.eno=eno;
	  this.ename=ename;
	  this.eadd=eadd;
	  System.out.println("parameterized constructor");
	  
  }
  void displayDetails()
  {
	  System.out.println(eno+"\t"+ename+"\t"+eadd);
  }
  public Employee()
  {  eno=1;
   ename="shiva";
   
	  System.out.println("employee default constructor");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee e=new Employee(100,"shiva","hyd");
   Employee e1=new Employee(100,"shiva","hyd");
   Employee e2=new Employee();
   e.displayDetails();
   e1.displayDetails();
   e2.displayDetails();
   }

}
