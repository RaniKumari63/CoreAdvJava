package com.exception1;

import java.util.Scanner;

public class ExceptionDemoClient {
	
	
	static int fact(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		try
		{
			int x=sc.nextInt();
			if(x>0&&x<=5) throw new ExceptionDemo("Proper Number");
			else if(x>10) throw new ExceptionDemo("Greater Number");
			else
			{
				int fac=fact(x);
				System.out.println("The factorial of x is" +fac);
			}
		}
		catch(ExceptionDemo e)
		{
			e.printStackTrace();
		}

	}

}
