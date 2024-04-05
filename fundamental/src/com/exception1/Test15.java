package com.exception1;

class Test15 extends RuntimeException
{
	
	
	public static void main(String[] args)
	{
	try
	{
	System.out.println("try block executed");
	//throw e;
	throw new Test15();
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



