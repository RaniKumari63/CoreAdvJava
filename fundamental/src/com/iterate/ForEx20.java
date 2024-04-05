package com.iterate;

import java.util.Scanner;

public class ForEx20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int facnum=1;
		while(number!=0)
		{
			facnum*=number;
			number=number-1;
			
		}
		System.out.println("factorial of a number"+facnum);	
	}

}
