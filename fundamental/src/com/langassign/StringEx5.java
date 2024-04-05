package com.langassign;

import java.util.Scanner;

public class StringEx5 {
	
	static int[] toIntegerArray(String str)
	{
		String[] array1=str.split(" ");
		int[] newarray=new int[array1.length];
		for(int i=0;i<array1.length;i++)
		{
	    try
	    {
	    	newarray[i]=Integer.parseInt(array1[i]);
	    }
	    catch(NumberFormatException e)
	    {
	    	newarray[i]=-1;
		}
		}
	    return newarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		int[] array=toIntegerArray(str1);
		System.out.println("Integer Array");
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
		}
	}

}
