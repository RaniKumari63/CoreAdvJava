package com.lang2;

public class InternStringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("bhaskar");
		String s2=s1.intern();
		System.out.println(s1==s2); //false
		String s3="bhaskar";
		System.out.println(s2==s3);//true
	}

}
