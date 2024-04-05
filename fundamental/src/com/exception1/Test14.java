package com.exception1;

class Test14
{
	
	
	public static void main(String[] args)
	{
	try
	{
	System.out.println("try block executed");
	//throw e;
	throw new Test14();
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



