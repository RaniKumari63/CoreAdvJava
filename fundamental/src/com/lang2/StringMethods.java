package com.lang2;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ashok";
		System.out.println(s.charAt(3));//o
		//System.out.println(s.charAt(100));// RE : 
		s=s.concat("software");
	 s=s+"software";
		s+="software";
		 System.out.println(s);//ashoksoftware
		 String s1="java";
		 System.out.println(s1.equals("JAVA"));//false
		 System.out.println(s1.equalsIgnoreCase("JAVA"));//true
		 String s2="ashoksoft";
		 System.out.println(s2.substring(5));//soft
		 System.out.println(s2.substring(3,7));//okso
		 String s3="jobs4times";
		 System.out.println(s3.length());//10
		 //System.out.println(s.length);//compile time error
		 String s4="ababab";
		 System.out.println(s4.replace('a','b'));//bbbbbb


	}

}
