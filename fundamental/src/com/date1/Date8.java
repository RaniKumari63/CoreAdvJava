package com.date1;

import java.text.DateFormat;
import java.util.Date;

public class Date8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date currentDate=new Date();
System.out.println("current date:"+currentDate);
String datetoStr=DateFormat.getInstance().format(currentDate);
System.out.println("date format using getInstance():"+datetoStr);
System.out.println("currentdate:"+currentDate.getDate());
DateFormat df=DateFormat.getInstance();
String str=df.format(currentDate);

System.out.println("date format using getInstance():"+str);
DateFormat df1=DateFormat.getDateInstance();
String str1=df1.format(currentDate);
System.out.println("date format using getInstance():"+str1);
DateFormat df2=DateFormat.getTimeInstance();
String str2=df2.format(currentDate);
System.out.println("date format using getInstance():"+str2);
DateFormat df3=DateFormat.getDateTimeInstance();
String str3=df3.format(currentDate);
System.out.println("date format using getInstance():"+str3);
DateFormat df4=DateFormat.getTimeInstance(DateFormat.SHORT);
String str4=df4.format(currentDate);
System.out.println("date format using getInstance():"+str4);
	}

}
