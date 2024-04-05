package com.sort;

import java.util.Scanner;

public class LinearStringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int len=sc.nextInt();
		String [] array1=new String[len];
		for(int i=0;i<array1.length;i++)
		{  System.out.println("Enter the String value");
			array1[i]=sc.next();
		}
		System.out.println("Number to be searched");
		String str=sc.next();
		int count=0;
		for(int i=0;i<array1.length;i++)
		{ count=0;
			if(array1[i].equalsIgnoreCase(str))
			{
				System.out.println("Number is at "+i);
				break;
			}
			else
			{
				count++;
			}
			
		}
		if(count!=0)
		{System.out.println("Number not found");
			
		}
	}

}
