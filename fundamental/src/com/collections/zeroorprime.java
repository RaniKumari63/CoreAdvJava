package com.collections;

import java.util.Scanner;

public class zeroorprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		
		
		 

}
	
	
	public static void check_exception(int number) throws Number0
	{ 
		if(number==0)
		{
			throw(new Number0("number is 0"));
		}
		else
		{
			Primeornot(number);
		}
		
	}
	
	
	public void Primeornot(int number)
	{
		int check=0;
		if(number==1)
		{
			System.out.println("The number is not prime");
		}
		else
		{
			for(int i=2;i<=Math.sqrt(number);i++)
			{
				
			}
		}
	}
}
class Number0 extends Exception 
{
	public Number0(String msg)
	{
		super(msg);
	}
}


