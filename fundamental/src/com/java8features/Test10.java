package com.java8features;
interface Lf
{
	default void m1()
	{
		System.out.println("Left default method");
	}
}
interface Rt
{
	default void m1()
	{
		System.out.println("Right default method");
	}
}

public class Test10 implements Lf,Rt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Test10 t=new Test10();
t.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Lf.super.m1();
		Rt.super.m1();
		System.out.println("test class method");
	}

}
