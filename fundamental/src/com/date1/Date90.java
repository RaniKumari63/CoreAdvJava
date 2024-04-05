package com.date1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date90 {
public static void main(String[] args) throws ParseException
{
	Date date=new Date();
	SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
	String strDate=formatter.format(date);
	Date date1=formatter.parse("31/05/2015");
	System.out.println(date1);
	System.out.println(strDate);
	SimpleDateFormat formatter1=new SimpleDateFormat("MM/dd/yyyy");
	String strDate1=formatter1.format(date);
	System.out.println(strDate1);
	SimpleDateFormat formatter2=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	String strDate2=formatter2.format(date);
	System.out.println(strDate2);
	SimpleDateFormat formatter3=new SimpleDateFormat("dd-MMMM-yyyy");
	String strDate3=formatter3.format(date);
	System.out.println(strDate3);
	SimpleDateFormat formatter4=new SimpleDateFormat("dd-MMMM-yyyy zzzz");
	String strDate4=formatter4.format(date);
	System.out.println(strDate4);
	SimpleDateFormat formatter5=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss z");
	String strDate5=formatter5.format(date);
	System.out.println(strDate5);
	SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss zz");
	String strDate6=formatter6.format(date);
	System.out.println(strDate6);
	SimpleDateFormat sdf1 = new SimpleDateFormat("MM / dd / yy" );  
	Calendar clndr = Calendar.getInstance();  
	clndr.setTime(sdf1.parse("11 / 12 / 21"));  
	System.out.println("Initial Timing is : " + clndr.getTime());  

	
}
}
