package com.constructor;

class A7 {

	A7() {
		System.out.println("A-con");
	}
}

class B7 extends A7 {
	B7() {
		System.out.println("0-int-param-con");
	}

	B7(int i) {
		System.out.println("B-int-param-con");
	}
}

class C7 extends B7 {
	C7(int i) {
		System.out.println("C-int-param-con");
	}

	C7() {
		System.out.println("0-int-param-con");
	}
}

class Test4 {
	public static void main(String args[]) {
		C7 c = new C7();
	}
}
