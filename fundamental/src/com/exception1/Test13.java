package com.exception1;

class Test13
{
	
	static ArithmeticException e=new ArithmeticException();
	static ArithmeticException e1;
	public static void main(String[] args)
	{
	try
	{
	System.out.println("try block executed");
	//throw e;
	throw e1;
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



