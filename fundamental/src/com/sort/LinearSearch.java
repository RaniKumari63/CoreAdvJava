package com.sort;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int len=sc.nextInt();
		int [] array1=new int[len];
		for(int i=0;i<array1.length;i++)
		{  System.out.println("Enter the value");
			array1[i]=sc.nextInt();
		}
		System.out.println("Number to be searched");
		int num=sc.nextInt();
		int count=0;
		for(int i=0;i<array1.length;i++)
		{ count=0;
			if(array1[i]==num)
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
