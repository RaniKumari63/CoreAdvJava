package com.overloading1;

public class Test {
	
	public void m1()
	{
		System.out.println("no-arg method");
	}
	public void m1(int i)
	{
		System.out.println("int-arg method");
	}
	public void m1(double d)
	{
		System.out.println("double-arg method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Test t=new Test();
 t.m1();
 t.m1(10.0);
 t.m1(8798);
	}

}
