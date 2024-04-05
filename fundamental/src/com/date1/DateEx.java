package com.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date now=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
String nowStr=sdf.format(now);
System.out.println("current date"+nowStr);
System.out.println("date"+sdf.parse(new Date()));

	}

}
