package com.abstractassignment;

import java.util.Scanner;

public class RequestedTicket {

	void request()
	{
		Scanner rt=new Scanner(System.in);
		System.out.println("Check Available Tickets");
		int avalibility=rt.nextInt();
		if(avalibility==1)
		{
		System.out.println("First Class Available");
		System.out.println("Enter your Name");
		String pname=rt.next();
		System.out.println("Enter your Phone Number");
		double pno = rt.nextDouble();
		System.out.println("Your ticket is Requested");
		}
		else if(avalibility==2)
		{
			System.out.println("Not Available");
		}
	}
	
	
}
