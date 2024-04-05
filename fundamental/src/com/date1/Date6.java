package com.date1;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Date6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cln=Calendar.getInstance();
		Date d=cln.getTime();
		Instant instt = d.toInstant();  
		System.out.println("The Original Date is:"+d.toString());
		System.out.println("the instant is:"+instt);
		
		Calendar calendar=Calendar.getInstance();
		System.out.println("The current date is:"+calendar.getTime());
	
		
		calendar.add(Calendar.DATE, -15);
	System.out.println("15 days ago:"+calendar.getTime());
	calendar.add(Calendar.DATE, 15);
	System.out.println("15 after:"+calendar.getTime());
	calendar.add(Calendar.MONTH,4);
	System.out.println("4 months later:"+calendar.getTime());
	calendar.add(Calendar.YEAR,4);
	System.out.println("4 years later:"+calendar.getTime());
	}

}
