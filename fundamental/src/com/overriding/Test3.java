package com.overriding;

class A{
	void m1()
	{
		System.out.println("m1-a");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("m1-b");
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A(); 
		 a.m1(); 
		 B b=new B(); 
		 b.m1(); 
		 A a1=new B(); 
		 a1.m1();
	}

}
