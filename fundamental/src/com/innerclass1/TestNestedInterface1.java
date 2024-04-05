package com.innerclass1;

public class TestNestedInterface1 implements Showable.message {

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("hello nested interface");
		
	}
	public static void main(String args[])
	{
		Showable.message m=new TestNestedInterface1();
		m.msg();
	}

}
 class TestInterface1 implements Showable{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello  interface");
		Showable s=new TestInterface1();
		s.show();
		
	}
	 
 }
