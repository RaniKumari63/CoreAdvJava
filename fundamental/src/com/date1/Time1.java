package com.date1;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Time1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] id=TimeZone.getAvailableIDs();
for(int i=0;i<id.length;i++)
{
System.out.println("timezone"+id[i]);
}
TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
System.out.println("The Offset value of TimeZone: " +   
zone.getOffset(Calendar.ZONE_OFFSET));  
System.out.println("Value of ID is:"+zone.getID());
TimeZone zone1 = TimeZone.getDefault();  
String name = zone1.getDisplayName(); 
System.out.println("Value of ID is:"+zone1.getID());
System.out.println("Display name for default time zone: "+ name);  
	
TimeZone tz = TimeZone.getDefault();  

//setting the time zone ID  
tz.setID("GMT-3:30");  
String name1 = zone1.getDisplayName(); 
//checking for the time zone ID  
System.out.println("The Time zone ID is: " + tz.getID()); 
System.out.println("Display name for default time zone: "+ name1);  



	}

}
