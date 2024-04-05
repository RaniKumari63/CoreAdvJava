package com.lang2;

public class InternStringex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("bhaskar");
		String s2=s1.concat("software");
		String s3=s2.intern();
		String s4="bhaskarsoftware";
		System.out.println(s3==s4);//true
	}

}
