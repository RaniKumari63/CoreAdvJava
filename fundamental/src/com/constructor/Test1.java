package com.constructor;

public class Test1 {

	static int count=0;
	{
	count++;
	}
	Test1()
	{
		
	}
	Test1(int i)
	{
		
	}
void Test1()
	{
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t1=new Test1();
	Test1 t2=new Test1(10);	
	Test1 t3=new Test1();
	System.out.println(count);
	
	
	}

}
