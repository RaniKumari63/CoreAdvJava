package com.date1;

import java.sql.Date;

public class Date3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Date date1=new java.util.Date();
		System.out.println(date1);
		long millis=System.currentTimeMillis();
		Date date2=new Date(millis);
		System.out.println(date2);
		String str="2015-03-31";
		Date date4=Date.valueOf(str);
		System.out.println(date4);
		
		
	}

}
