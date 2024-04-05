package com.classforname;

public class A {

	static {
		System.out.println("Class Loading");
	}
	private A()
	{
		System.out.println("Object Creating");
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Exception 
	{
	Class c=Class.forName("com.classforname.A");
	Object obj=c.newInstance();
	}
}
