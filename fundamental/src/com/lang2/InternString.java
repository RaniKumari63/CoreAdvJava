package com.lang2;

public class InternString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=new String("rani");
String s2=s1.intern();
System.out.println(s1==s2);
String s3="bhaskar";
System.out.println(s2==s3);
	}

}
