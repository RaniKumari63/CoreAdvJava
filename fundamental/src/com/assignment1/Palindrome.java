package com.assignment1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temnum=number;
		int remainder=0;
		int reverse=0;
		int sum=0;
		while(number!=0)
		{
			remainder=number%10; 
			reverse=reverse*10+remainder;
				number=number/10;
			sum+=remainder;
			
		}
		System.out.println("reverse of a number"+reverse);
		if(temnum==reverse)
		{
			System.out.println("the number is palindrome");
		}
		System.out.println("the sum of a number"+sum);
			
		// TODO Auto-generated method stub

	}

}
