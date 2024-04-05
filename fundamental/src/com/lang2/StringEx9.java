package com.lang2;

public class StringEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcdef";

char ch=str.charAt(1);
char ch1=str.charAt(4);
char[] chararr=str.toCharArray();

chararr[1]=str.charAt(4);
chararr[4]=str.charAt(1);
System.out.println(String.valueOf(chararr));
	}

}
