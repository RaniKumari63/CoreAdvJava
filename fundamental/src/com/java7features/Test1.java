package com.java7features;

public class Test1 {

	public static void main(String[] args) {
		int ar[];
		// TODO Auto-generated method stub
try {
		ar=new int[10];
		ar[10]=30/0;
		
}
catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
{
	e.printStackTrace();
}
	finally
	{
		ar=null;
	}




	}
	

}
