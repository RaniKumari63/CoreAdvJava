package com.exception1;

class AgeIsNotsuitable extends Exception
{
	
	public AgeIsNotsuitable(String str)
	{
	super(str);
	}
}


public class Test22 
{
	
	public static void validate(int age) throws AgeIsNotsuitable
	{
		if(age<18)
		{
			System.out.println("He/She is elible for vote");
			
		}
		else
		{
			throw new AgeIsNotsuitable("He/She is not eligible for vote");
		}
	}
	
	public static void main(String[] args) throws AgeIsNotsuitable
	{
	 try {
		validate(12);
	 }
	 catch(ArithmeticException e)
	 {System.out.println(e.getMessage());
		System.out.println("hello boss");
	 }
	}
}



