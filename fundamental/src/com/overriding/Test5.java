package com.overriding;

class A3{
	final void m1()
	{
		System.out.println("m1-a");
		 
	}
}
class B3 extends A3
{
	final void m1()
	{
		System.out.println("m1-b");
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A3 a=new A3(); 
		 a.m1(); 
		 B3 b=new B3(); 
		 b.m1(); 
		 A3 a1=new B3(); 
		 a1.m1();
	}

}
