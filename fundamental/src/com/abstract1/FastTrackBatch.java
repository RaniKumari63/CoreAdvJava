package com.abstract1;

public class FastTrackBatch extends Student {

	public FastTrackBatch(int studentid, String name, long mobileNo, String address, String course) {
		super(studentid, name, mobileNo, address, course);
		
		// TODO Auto-generated constructor stub
	}
	public  int calculateFee(String course) {
		System.out.println("Welcome to fastrack");

			if(course.equals("java"))
		{
			return 55000;
		}
		else if(course.equals("php"))
		{
			return 35000;

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
