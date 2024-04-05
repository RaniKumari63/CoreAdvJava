package com.abstractassignment;

import java.util.Scanner;

public class ConformedTicket extends RequestedTicket {
	static int seatno;static double Phonenumber;static String name;

	void conformed()
	{ 
		Scanner ct=new Scanner(System.in);
		ConformedTicket bc=new ConformedTicket();
		System.out.println("CheckAvailable Tickets");
		int avalibility=ct.nextInt();
		if (avalibility == 1) {
			System.out.println("Enter your Name");
			String pname = ct.next();name=pname;
			System.out.println("Enter your Phone Number");
			double pno = ct.nextDouble();Phonenumber=pno;
			System.out.println("Available seat numbers are 20" + "\n"
			+ "Enter your Desired Seat Number");
			int sno = ct.nextInt();
			if (sno >= 1 && sno <= 20) {
				seatno=sno;
			System.out.println("Your ticket is Conformed");
			System.out.println(KaveriTravels.sdestination+"\n"+KaveriTravels.stime+"\n"+KaveriTravels.sdate+"\n"+ConformedTicket.seatno);
			System.out.println(ConformedTicket.name+"\n"+ConformedTicket.Phonenumber);
			} else {
			System.out.println("Not applicable");
			}
			} else if (avalibility == 2) {
			System.out.println("Tickets not Available"+"\n"+"Waiting list");
			bc.request();//calling request method
			}
			}

	
}
