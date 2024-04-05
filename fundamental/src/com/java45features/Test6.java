package com.java45features;

public class Test6 {
enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day d=Day.MONDAY;
switch(d)
{
case SUNDAY:
	System.out.println("sunday");
	break;
case MONDAY:
	System.out.println("monday");
	break;
case TUESDAY:
	System.out.println("tuesday");
	break;
case WEDNESDAY:
	System.out.println("wednesday");
	break;
case THURSDAY:
	System.out.println("thursday");
	break;
case FRIDAY:
	System.out.println("friday");
	break;
case SATURDAY:
	System.out.println("saturday");
	break;
	default:
		System.out.println("other day");

}
	}

}
