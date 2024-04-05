package com.java8features;

import java.util.function.Predicate;

public class Test19 {
public static void pred(int number,Predicate<Integer> predicate)
{
	
	if(predicate.test(number))
	{
		System.out.println("number"+number);
	}
	
}
public static void pred1(int number,Predicate<Integer> predicate)
{
	if(predicate.test(number))
	{
		System.out.println("number"+number);
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  pred(10,i->i>7);
  pred1(15,i->i<10);
	}

}
