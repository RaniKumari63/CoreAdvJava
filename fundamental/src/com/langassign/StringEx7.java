package com.langassign;

import java.util.Scanner;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		int index=firstNonRepeating(str1);
		System.out.println(index);
		if(index<str1.length())
		{
		
		System.out.println(str1.charAt(index));
		}
	}
	static int firstNonRepeating(String str)
	{
		int[] arraycount=new int[256];
		int[] arrayIndex=new int[256];
		int i;
		for(i=0;i<str.length();i++)
		{arraycount[str.charAt(i)]++;
			arrayIndex[str.charAt(i)]=i;
			//System.out.println(str.charAt(i));
		}
		int index=Integer.MAX_VALUE;
		
	for( i=0;i<256;i++)
	{
		if(arraycount[i]==1&&arrayIndex[i]<index)
		{
			index=arrayIndex[i];
		}
			
		
	}
	return index;
	}

}
