package com.java8;

public class methodReferenceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodReferenceex.m2();
		methodReferenceex obj=new methodReferenceex();
		obj.m1();
		
		//reference::methodName
		//methodReferenceex::m2(); //static method reference
		//obj::m1() //instance method reference
	}

	public void m1()
	{
		System.out.println("m1");
	}

	public static void m2()
	{
		System.out.println("m2");
	}
}
