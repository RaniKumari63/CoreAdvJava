package com.lang2;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("bhaskar");
		s.concat("software");
		System.out.println(s);
		
		StringBuffer s1=new StringBuffer("bhaskar");
		s1.append("software");
		System.out.println(s1);
		
		String st1=new String("rani");
		String st2=new String("rani");
		
		System.out.println(st1==st2);
		System.out.println(st1.equalsIgnoreCase(st2));
		
	}

}
