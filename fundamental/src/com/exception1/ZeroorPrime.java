package com.exception1;

import java.util.Scanner;
 class Zero_Exception extends Exception
{
	public Zero_Exception(String str)
	{
		
		System.out.println(str);
	}
	
}

 class One_Exception extends Exception
 {
 	public One_Exception(String str)
 	{
 		
 		System.out.println(str);
 	}
 	
 }
public class ZeroorPrime {

	public static void main(String[] args)  throws Zero_Exception,One_Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num==0)
		{
		throw new Zero_Exception("0 is not prime number");	
		}
		else if(num==1)
		{
			throw new One_Exception("1 is not prime number");	
		}
		else
		{
		check_prime(num);
		}

	}

	
	public static void check_prime(int n)
	{
		int count=0;
		
		for(int i=2;i<n;i++)
	{if(n%i==0)
	  { 
		count++;
		break;
	}

	}
	if(count==0)
	{
		System.out.println(n+" is prime");
	}
	else
	{
		System.out.println(n+"is not a prime");
	}
		
		
	}
}
