package com.overloading1;

public class Test1 {

	public void m1(int i)
	{
		System.out.println("int-arg method");
	}
	public void m1(float f)
	{ System.out.println("float-arg");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		 t1.m1('a');
		 t1.m1(10l);
		// t1.m1(10.5);
		 

	}

}
