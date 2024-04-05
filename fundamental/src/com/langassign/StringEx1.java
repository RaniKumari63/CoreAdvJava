package com.langassign;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str1=sc.nextLine();
System.out.println("enter the string");
String str2=sc.nextLine();
String output=removecharacter(str1,str2);
System.out.println("final string is:"+output);
	}
	
	static String removecharacter(String str1,String str2)
	{int[] num=new int[256];
	System.out.println(Arrays.toString(num));
for(int i=0;i<str2.length();i++)
{num[str2.charAt(i)]++;
	
}
String output="";
for(int i=0;i<str1.length();i++)
{
	if(num[str1.charAt(i)]==0)
	{
		output+=str1.charAt(i);
	}
}
		
		
		return output;
	}

}
