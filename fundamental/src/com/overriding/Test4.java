package com.overriding;

class A2{
	int m1()
	{
		System.out.println("m1-a");
		return 10;
	}
}
class B2 extends A2
{
	void m1()
	{
		System.out.println("m1-b");
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A2 a=new A2(); 
		 a.m1(); 
		 B2 b=new B2(); 
		 b.m1(); 
		 A2 a1=new B2(); 
		 a1.m1();
	}

}
