package com.date1;

import java.util.Calendar;

public class Date7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar calendar=Calendar.getInstance();
System.out.println(calendar.getTime());
System.out.println("Year:\t"+calendar.get(Calendar.YEAR));
System.out.println("Month:\t"+calendar.get(Calendar.MONTH));
System.out.println("date:\t"+calendar.get(Calendar.DATE));
System.out.println("Month:\t"+calendar.get(Calendar.DAY_OF_MONTH));
	int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);
	int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);
	System.out.println("maximum"+maximum);
	System.out.println("minimum"+minimum);
	int maximum1=calendar.getMaximum(Calendar.WEEK_OF_YEAR);
	int minimum1=calendar.getMinimum(Calendar.WEEK_OF_YEAR);
	System.out.println("maximum"+maximum1);
	System.out.println("minimum"+minimum1);
	
	}

}
