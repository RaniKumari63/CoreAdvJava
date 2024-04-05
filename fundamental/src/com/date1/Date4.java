package com.date1;

import java.sql.Date;
import java.time.LocalDateTime;

public class Date4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Date d=new java.util.Date();
System.out.println("Initial is:"+d);
d.setTime(1000000);
System.out.println("Date after the setting the time is: " + d);  
	LocalDateTime dtm=LocalDateTime.now();
	System.out.println("The date is:"+dtm.toLocalDate());
	
	}

}
