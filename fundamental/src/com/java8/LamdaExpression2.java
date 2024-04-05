package com.java8;

interface Operator<Integer>
{
	public int process(int a,int b);
}
public class LamdaExpression2 {
	
	public static void main(String []args)
	{
Operator<Integer> add1=(a,b)->a+b;
Operator<Integer> sub=(a,b)->a-b;

System.out.println(add1.process(1, 2));
System.out.println(sub.process(2, 1));
}
}
