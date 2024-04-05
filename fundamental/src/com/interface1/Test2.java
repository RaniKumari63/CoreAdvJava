package com.interface1;

public class Test2  implements Left,Right{

	public void m1()
	{
		System.out.println("method one");
	}
	public void m2()
	{ System.out.println("left m2 ");
		
	}
	public void m2(int i)
	{
		System.out.println("right m2 ");
	}
}
