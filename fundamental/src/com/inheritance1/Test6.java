package com.inheritance1;

class A6 {
	static {
		System.out.println("SB-A");
	}

	static int m1() {
		System.out.println("m1-A");
		return 10;
	}

	static int i = m1();
}

class B6 extends A6 {
	static int j = m2();
	static {
		System.out.println("SB-B");
	}

	static int m2() {
		System.out.println("m2-B");
		return 20;
	}
}

class C6 extends B6 {
	static int m3() {
		System.out.println("m3-C");
		return 30;
	}

	static int k = m3();
	static {
		System.out.println("SB-C");
	}
}

class Test6 {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
	}
}
