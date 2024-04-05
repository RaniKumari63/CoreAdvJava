package com.iterate;

import java.util.Scanner;

public class ForEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temnum=number;
		int cube1=0;
		int remainder=0;
		int reverse=0;
		int sum=0;
		while(number!=0)
		{
			remainder=number%10; 
		
				number=number/10;
				cube1+=remainder*remainder*remainder;
			
			
		}
	if(cube1==temnum)
	{
		System.out.println("number is amstrong ");
	}
			
	}

}
