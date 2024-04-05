package com.java8;
interface MyInterface
{
	double getPiValue();
}
public class LamdaExpression {

	
	public static void main(String[] args)
	{
		MyInterface ref=()->3.14;
		System.out.println(ref.getPiValue());
		
	}
}
