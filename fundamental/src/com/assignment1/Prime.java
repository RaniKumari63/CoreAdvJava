package com.assignment1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		if((number==0)||(number==1))
		{
			System.out.println("number is prime");
		}
		for(int i=2;i<number;i++)
		{if(number%i==0)
		  { 
			count++;
			break;
		}

		}
		if(count==0)
		{
			System.out.println("number is prime"+number);
		}
	}

}
