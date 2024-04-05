package com.exception1;
class Test21 
{
	
	public static void validate(int age)
	{
		if(age<18)
		{
			System.out.println("He/She is elible for vote");
			
		}
		else
		{
			throw new ArithmeticException("He/She is not eligible for vote");
		}
	}
	
	public static void main(String[] args)
	{
	 try {
		validate(12);
	 }
	 catch(ArithmeticException e)
	 {
		System.out.println("hello boss");
	 }
	}
}



