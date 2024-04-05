package com.super1;

class A10 {
	void m1() {
		System.out.println("m1-A");
	}
}

class B10 extends A10 {
	void m2() {
		System.out.println("m2-B");
		m1();
		this.m1();
		super.m1();
	}



	void m1() {
		System.out.println("m1-B");
	}
}

class Test10 {
	public static void main(String args[]) {
		B10 b = new B10();
		b.m2();
	}
}