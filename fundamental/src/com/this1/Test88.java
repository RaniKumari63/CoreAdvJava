package com.this1;

public class Test88 {

	Test88 m1()
	{   System.out.println(this);
		return this;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test88 t=new Test88();
 t.m1();
 System.out.println(t);
	}

}
