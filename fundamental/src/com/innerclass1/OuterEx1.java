package com.innerclass1;

public class OuterEx1 {

	
	class InnerEx1{
		public void printout()
		{
			System.out.print("hai");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterEx1 o=new OuterEx1();
		o.m1();
	}
	public   void m1()
	{  InnerEx1 in=new InnerEx1();
	in.printout();
		System.out.println("hello");
	}

}
