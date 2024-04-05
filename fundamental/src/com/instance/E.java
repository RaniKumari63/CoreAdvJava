package com.instance;

public class E {
	int m1()
	{
		System.out.println("m1-e");
		return 10;
	}
	
	{
		System.out.println("ib-e");
	}
	int i=m2();
	E()
	{
		System.out.println("e-con");
	}
	int j=m1();
	{
		System.out.println("ib1-e");
	}
	int m2()
	{
		System.out.println("m2-e");
		return 20;
	}

}
