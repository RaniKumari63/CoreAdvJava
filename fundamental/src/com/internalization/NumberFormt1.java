package com.internalization;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.Locale;

public class NumberFormt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=123456.789;
		NumberFormat nf=NumberFormat.getInstance(Locale.FRENCH);
		System.out.println("ITALY form is :"+nf.format(d));
		Locale INDIA=new Locale("pa","IN");

	
	NumberFormat nf1=NumberFormat.getCurrencyInstance(INDIA);
	NumberFormat nf2=NumberFormat.getInstance();
	System.out.println("india\t"+nf1.getCurrency());
	System.out.println("india\t"+nf1.getCurrencyInstance());
	NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.UK);
	System.out.println("UK notation is :"+nf3.format(d));
	NumberFormat nf4=NumberFormat.getCurrencyInstance(Locale.US);
	System.out.println("US notation is :"+nf4.format(d));
	NumberFormat nf5=NumberFormat.getCurrencyInstance(Locale.ITALY);
	System.out.println("ITALY notation is :"+nf5.format(d));

	}

}
