package com.method;

public class MethodEx {

	String funX()
	{
		return "rani";
	}
	double funX1()
	{
		return 10.23;
	}
	char funX2()
	{
		return 'c';
	}
	long funX3()
	{
		return 2535464909l;
	}
	int funX4()
	{
		return (int)2535464909l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodEx mx=new MethodEx();
		String s=mx.funX();
		System.out.println(s);
		double d=mx.funX1();
		System.out.println(d);
		int i=mx.funX4();
	}

}
