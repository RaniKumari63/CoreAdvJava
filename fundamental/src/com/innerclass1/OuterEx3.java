package com.innerclass1;

public class OuterEx3 {

	int x=10;
	static int y=20;
	class InnerEx1{
		int x=100;
		static int y=200;
		public void printout()
		{
			System.out.print("hai");
			System.out.println(x);
			System.out.println(y);
			System.out.println(this.x);
			System.out.println(this.y);
			System.out.println(OuterEx3.this.x);
			System.out.println(OuterEx3.this.y);
			m1();
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterEx3 o=new OuterEx3();
		o.m1();
		new OuterEx3().new InnerEx1().printout();
	}
	public   void m1()
	{  
	
	
		System.out.println("hello");
	}

}
