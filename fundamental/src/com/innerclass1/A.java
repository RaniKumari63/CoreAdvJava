package com.innerclass1;

public class A {
	class B{
		
		class C
		{
			public void m1()
			{
				System.out.println("C class method");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
A.B b=a.new B();
A.B.C  c=b.new C();
c.m1();
new A().new B().new C().m1();
	}

}
