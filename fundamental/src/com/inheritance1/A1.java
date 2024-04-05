package com.inheritance1;

public class A1 {
static {
	System.out.println("sb-a");
}
static int m1()
{
	System.out.println("m1-a");
	return 10;
}
static int i=m1();
}
