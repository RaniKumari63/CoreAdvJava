package com.String1;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1=new String("Durga");
		String str2=str1.concat("Software");
		String str3=str2.concat("Software");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=sb1.append("software");
		StringBuffer sb3=sb2.append("solutions");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
	}

}
