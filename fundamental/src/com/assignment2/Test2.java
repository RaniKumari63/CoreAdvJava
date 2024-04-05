package com.assignment2;

public class Test2 {
	
public static void main(String args[])
{int balls=0;
float overs=4.6f;

	String  str=Float.toString(overs);
balls=(Integer.parseInt(str.substring(0,1))*6)+Integer.parseInt(str.substring(2));
System.out.println(balls);
}
}
