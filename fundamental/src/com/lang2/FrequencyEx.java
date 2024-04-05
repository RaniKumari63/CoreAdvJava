package com.lang2;

import java.util.Scanner;

public class FrequencyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
	String str=sc.next();
	int flag=0;
	int[] num=new int[str.length()];
	
	for(int i=0;i<str.length();i++)
	{ char value= str.charAt(i);
	flag=0;
	for(int j=0;j<str.length();j++)
	{  
		if(value==str.charAt(j))
		{
			 
			flag++;
			num[i]=flag;
		}
	}
	System.out.println(str.charAt(i)+""+num[i]);
	}
	

}
}