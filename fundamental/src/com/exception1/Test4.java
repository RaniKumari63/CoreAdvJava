package com.exception1;

class Test4
{
public static void main(String[] args){

	System.out.println("statement1");
	try {
	System.out.println(10/0);
	
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
		System.out.println(ex);
		System.out.println(ex.getMessage());
	}
	System.out.println("statement3");

System.out.println("statement5");
}
}



