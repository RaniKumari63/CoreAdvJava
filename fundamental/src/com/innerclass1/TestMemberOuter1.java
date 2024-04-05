package com.innerclass1;

public class TestMemberOuter1 {

	private int data=30;
	class Inner{
		void msg()
		{
			System.out.println("data is"+data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMemberOuter1.Inner obj=new TestMemberOuter1().new Inner();
		obj.msg();
		TestMemberOuter1 ot=new TestMemberOuter1();
		TestMemberOuter1.Inner in=ot.new Inner();
		in.msg();
		System.out.println(obj.getClass());
		System.out.println(ot.getClass());
		
		
	}

}
