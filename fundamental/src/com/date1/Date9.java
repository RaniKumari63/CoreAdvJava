package com.date1;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;

public class Date9 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale icl=Locale.FRENCH;
java.util.Date d= DateFormat.getDateInstance().parse("07/01/23");
System.out.println("date is:"+d);
	}

}
