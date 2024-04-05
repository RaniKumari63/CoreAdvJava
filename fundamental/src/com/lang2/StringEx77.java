package com.lang2;

public class StringEx77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bhaskar";
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		String s4="bhaskar";
		String s5=s4.toString();
		System.out.println(s4==s5);//true

	}

}
