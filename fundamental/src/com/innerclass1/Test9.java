package com.innerclass1;

public class Test9 {

	
	
	static class Nested
	{
		public void m1()
		{
			System.out.println("nested class method");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test9.Nested t=new Test9.Nested();
		t.m1();
		
	}

}
