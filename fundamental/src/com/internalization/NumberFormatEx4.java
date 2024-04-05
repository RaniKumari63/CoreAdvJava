package com.internalization;

import java.text.NumberFormat;

public class NumberFormatEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NumberFormat nf=NumberFormat.getInstance();
nf.setMaximumFractionDigits(4);
System.out.println(nf.format(123.4));
System.out.println(nf.format(123.4567));
nf.setMinimumFractionDigits(3);
System.out.println(nf.format(123.4));
System.out.println(nf.format(123.4567));
nf.setMaximumIntegerDigits(3);
System.out.println(nf.format(1.234));
System.out.println(nf.format(123456.789));
nf.setMinimumIntegerDigits(3);
System.out.println(nf.format(1.234));
System.out.println(nf.format(123456.789));
String i="rani";
System.out.println("ggggggggggg\t"+i.hashCode());

	}

}
