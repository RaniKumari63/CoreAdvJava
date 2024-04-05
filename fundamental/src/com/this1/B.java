package com.this1;

public class B {
void m1()
{
	System.out.println("m1-b");
}
void m2()
{
	System.out.println("m2-b");
	m1();
	this.m1();
}
}
