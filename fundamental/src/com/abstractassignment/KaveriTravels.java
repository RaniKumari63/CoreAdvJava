package com.abstractassignment;

import java.util.Scanner;

public class KaveriTravels extends ConformedTicket {
	static int destination, date, time;
	static String sdestination,stime,sdate;
	public static void main(String[] args)
	{
	Scanner bt = new Scanner(System.in);
	KaveriTravels ab = new KaveriTravels();
	System.out.println("Welcome to KaveriTravels" + "\n"+ "Avalible Busses" + "\n" + "1.Hyderabad" + "\n"+ "2.Nizamabad" + "\n" + "Give your Destination Choice");
	destination = bt.nextInt();
	if (destination == 1) {
	sdestination="Hyderabad";
	System.out.println("Dates of Bus");
	System.out.println("1.7/sep/2015" + "\n" + "2.12/sep/2015" + "\n"+ "3.14/sep/2015");
	// System.out.println("Enter j");
	date = bt.nextInt();
	if (date == 1) {sdate="Sep 7 2015";
	System.out.println("Sep 7 2015" + "\n" + "Timings of Bus"+ "\n" + "1.9Am" + "\n" + "2.12Am"+"\n"+ "Give your Desired Time");
	time = bt.nextInt();
	if (time == 1) {
	stime="9Am";
	System.out.println("Bus No:500" + "\n" + "Reserve Tickets" );
	ab.conformed();
	} else if (time == 2) {
	stime="2.12Am";
	System.out.println("Bus No:501" + "\n" + "Reserve Tickets");
	ab.conformed();
	} else {
	System.out.println("Stop");
	}
	} else if (date== 2) {sdate="12/sep/2015";
	System.out.println("Sep 12 2015" + "\n" + "Timings of Bus"+ "\n" + "5Am" + "\n" + "11AM" + "\n"+ "Give your Desired Time");
	time = bt.nextInt();
	if (time == 1) {
	stime="5Am";
	System.out.println("Bus No:600" + "\n" + "Reserve Tickets");
	ab.conformed();
	} else if (time == 2) {
	stime="11AM";
	System.out.println("Bus No:601" + "\n" + "Reserve Tickets");
	ab.conformed();
	} else {
	System.out.println("Stop");
	}
	}
	} else if (destination == 2) {
	sdestination
	="Nizamabad"
	;
	System.out.println("Busses Not Avaliable");
	}

	}

}
