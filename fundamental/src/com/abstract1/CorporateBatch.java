package com.abstract1;

public class CorporateBatch extends Student {

	public CorporateBatch(int studentid, String name, long mobileNo, String address, String course) {
		super(studentid, name, mobileNo, address, course);
		// TODO Auto-generated constructor stub
	}
	public  int calculateFee(String course) {
		System.out.println("Welcome to corporatebatch");

		if(course.equals("java"))
		{
			return 90000;
		}
		else if(course.equals("php"))
		{
			return 70000;

		}
		else if(course.equals("python"))
		{
			return 56000;

		}
		else 
		{
			return 50000;

		}
		
	}
}
