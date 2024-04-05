package com.static1;

public class A3 {
int i=10;
static int j=20;
static void m1()
{
	System.out.println("m1-a3");
	System.out.println(j);
	//System.out.println(i);
	//System.out.println(this.j);
	A3 a=new A3();
	System.out.println(a.i);
	
}
void m2()
{
	System.out.println("m2-a");
	this.m1();
}
}
