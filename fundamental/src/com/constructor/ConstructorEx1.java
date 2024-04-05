package com.constructor;

public class ConstructorEx1 {
int sno;
	ConstructorEx1()
	{ sno=100;
		System.out.println("default constructor");
	}
	
	ConstructorEx1(int i,String str)
	{
		System.out.println("paramterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ConstructorEx1();
new ConstructorEx1();
new ConstructorEx1();
	}

}
