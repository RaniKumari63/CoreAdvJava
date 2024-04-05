package com.inheritance1;

public class A {
static {
	System.out.println("sb-a");
}
}
class B extends A{
	static {
		System.out.println("sb-c");
	}
}
class C extends B{
	static {
		System.out.println("c-con");
	}
}

