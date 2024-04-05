package com.exception1;

import java.util.Scanner;

public class ExceptionDemoClient2 {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		try
		{String name =sc.next();
			if(name.length()>0 && name.length()<=5) throw new ExceptionDemo("Too small String");
			else if(name.length()>5 && name.length()<10)
				throw new ExceptionDemo("Perfect String");
			else
			{
				System.out.println("The String is perfectly entered");
			}
		}
		catch(ExceptionDemo e)
		{
			e.printStackTrace();
		}

	}

}
