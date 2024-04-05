package com.inheritance1;

public class B1 extends A1 {

	static int j = m2();
	static {
		System.out.println("SB-B");
	}

	static int m2() {
		System.out.println("m2-B");
		return 20;
	}
}




