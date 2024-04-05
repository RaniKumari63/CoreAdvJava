package com.static1;

public class A4 {
int i=10;
static int j=20;
static {
	System.out.println("sb-a");
	//System.out.println(i);
	A4 a=new A4();
	System.out.println(a.i);
	System.out.println(j);
	//System.out.println(this.j);
}
}
