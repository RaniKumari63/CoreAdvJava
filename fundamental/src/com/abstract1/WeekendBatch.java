package com.abstract1;

public class WeekendBatch extends Student {

	public WeekendBatch(int studentid, String name, long mobileNo, String address, String course) {
		super(studentid, name, mobileNo, address, course);
		// TODO Auto-generated constructor stub
		

	}
	public  int calculateFee(String course) {
		System.out.println("Welcome to weekendbatch");
		if(course.equals("java"))
		{
			return 40000;
		}
		else if(course.equals("php"))
		{
			return 15000;

		}
		else if(course.equals("python"))
		{
			return 25000;

		}
		else 
		{
			return 15000;

		}
		
	}
}
