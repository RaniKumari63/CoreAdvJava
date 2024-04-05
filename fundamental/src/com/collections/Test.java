package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;







public class Test {
Scanner sc=new Scanner(System.in);
static List<Classes> classes1=new ArrayList<Classes>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.addClasses();
		for(Classes c:classes1)
		   {
			
			 {    if((c.getClasstype().equals("ac1"))) {
				 System.out.println(c.getSeats().size());
				  for(int i=0;i<c.getSeats().size();i++)
					  
				  {
					  System.out.println(c.getSeats().get(i));
				  }
					 }
			 }
		   }
		   }
		
		
	
	public void addClasses()
	{int k = 1, i = 1;
		while (k == 1) {

		System.out.println("Enter Class Type");
		String cname = sc.next();
		     System.out.println("Enter No.of Seats");
         int size1=sc.nextInt();
         List<Integer> g=new ArrayList<Integer>();

         for(int i1=0;i1<size1;i1++)
         {
        	 g.add(0);
         }
        Classes c=new Classes(cname,g);
		classes1.add(c);
		

		System.out.println("Do you want to add one more classes Yes(1)/No(0)");
		k = sc.nextInt();
		i++;
	}
		
	}

}


 class Classes {
private String classtype;
private List<Integer> seats;

public Classes(String classtype, List<Integer>seats) {
	super();
	this.classtype = classtype;
	this.seats = seats;
}



public List<Integer>getSeats() {
	return seats;
}

public void setSeats(List<Integer>seats) {
	this.seats = seats;
}

public Classes() {
	super();
	// TODO Auto-generated constructor stub
}

public Classes(String classtype) {
	super();
	this.classtype = classtype;
}

public String getClasstype() {
	return classtype;
}

public void setClasstype(String classtype) {
	this.classtype = classtype;
}
}
