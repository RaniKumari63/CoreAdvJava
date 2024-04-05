package com.java8features;
interface Division{
int division(int a,int b);	
}

interface Print
{
	void m1(String str);
	default void m2()
	{System.out.println("hhhhhhh");
		
	}
	static void m3()
	{
		System.out.println("kkkkkkkkkkkkk");
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Division d=(a,b)->
		{
			return a%b;
		};
		int result=d.division(20, 2);
		System.out.println(result);
		
		Print p=str->
		{
			System.out.println(str);
		};
		p.m1("fffffff");
		p.m2();
		Print.m3();
		Division d1=(int a,int b)->
		{
			return a%b;
		};
		int result1=d.division(20, 2);
		System.out.println(result1);
		
	}

}
