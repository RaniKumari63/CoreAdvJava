package com.innerclass1;

public class OuterEx2 {

	int x=10;
	static int y=20;
	class InnerEx1{
		public void printout()
		{
			System.out.print("hai");
			System.out.println(x);
			System.out.println(y);
			m1();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterEx2 o=new OuterEx2();
		o.m1();
		new OuterEx2().new InnerEx1().printout();
	}
	public   void m1()
	{  
	
	
		System.out.println("hello");
	}

}
