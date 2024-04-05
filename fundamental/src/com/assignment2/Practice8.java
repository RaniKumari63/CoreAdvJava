package com.assignment2;

import java.util.Scanner;

public class Practice8 {
	String revString = "";
 static  String str2="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice8 p7 = new Practice8();
		System.out.println("Enter the string value");
		Scanner sc = new Scanner(System.in);
		  str2 = sc.next();
		  System.out.println(str2);
		String str1 = p7.encrypt(str2);
		 System.out.println(str1);
		System.out.println("Enter String value from reverse string");
		String text=sc.next();
		
		String s=p7.decrpyt(text);
		System.out.println("decrypt texted\t"+s);
	}

	String encrypt(String str) {
		char ch[] = str.toCharArray();

				char revch[] = new char[ch.length];
		for (int i = ch.length - 1, j = 0; ((i >= 0) && (j < ch.length)); i--, j++) {

			if (Character.isAlphabetic(ch[i]))

			{
				revch[j] = ch[i];
				revString += revch[j] + "";

			} 
				  else { revString = null; break; }
				 
		}

		return revString;
	}
	String decrpyt(String str3)
	{    String ss="";
		 char ch2[]=revString.toCharArray();
		 char ch1[]=str2.toCharArray();
		 if(revString.contains(str3)) {
		 int i=revString.indexOf(str3);
		
		 int len=str3.length();
		 
		 for(int j=i;j<(i+len);j++)
		 { 
			 ss+=ch1[j];
		
		 }
		 }
		 else
		 {
			 ss=null;
		}
		
		return ss;
	}
}
