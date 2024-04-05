package com.exception1;

public class ExceptionEx1 {

	void funA() throws ArithmeticException, NullPointerException {

		int x = 100;
		int y = 100 / 0;
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExceptionEx1 ex=new ExceptionEx1();

	try
	{
		try
		{
			System.out.println("To show arithmetic exception");
			int x=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		try{
			int a[]=new int[6];
			a[7]=10;
			}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index out of bounds Exception");
			}
			try{
			ex.funA();
			}catch(ArithmeticException|NullPointerException e){
			System.out.println("Either arithmetic or null pointer exception.to be exact"+e);

	}
	}catch(Exception e)
	{
		System.out.println("Handling Exception");
	}
	finally
	{
		System.out.println("to perform the cleanup activities");
	}
	}

}
