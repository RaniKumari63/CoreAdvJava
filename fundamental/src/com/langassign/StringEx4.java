package com.langassign;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		String newString=reverseString(str1);
		System.out.println("the new string is\""+newString+"\"");
	}
static String reverseString(String str)
{
	String[] words=str.split(" ");
	String rev="";
	int i,j;
	for(i=0;i<words.length;i++)
	{
		StringBuffer sb=new StringBuffer(words[i]);
		rev+=sb.reverse().toString();
		rev+=" ";
		
	}
	return rev;
}
}
