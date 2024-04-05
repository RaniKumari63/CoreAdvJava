package com.static1;

class A8{
	static int i = m2();

	A8() {
		System.out.println("A-con");
	}

	int m1() {
		System.out.println("m1-A");
		return 10;
	}

	static {
		System.out.println("SB-A");
	}
	int j = m1();
	{
		System.out.println("IB-A");
	}

	static int m2() {
		System.out.println("m2-A");
		return 10;
	}
}
