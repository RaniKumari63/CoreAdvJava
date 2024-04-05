package com.exception1;

class Test12
{
	public static void main(String[] args)
	{
	try
	{
	System.out.println("try block executed");
	throw new ArithmeticException("/by zero");
	}
	catch(NullPointerException e)
	{
	System.out.println("catch block executed");
	}
	finally
{
System.out.println("finally block executed");
	}
	
	
	
	}
}



