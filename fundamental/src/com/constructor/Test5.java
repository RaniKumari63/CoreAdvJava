package com.constructor;

class A8 {

	A8() {
		System.out.println("A-con");
	}
}

class B8 extends A8 {


	B8(int i) {
		System.out.println("B-int-param-con");
	}
}

class C8 extends B8 {
	C8(int i) {
		System.out.println("C-int-param-con");
	}

}

class Test5 {
	public static void main(String args[]) {
		C8 c = new C8();
	}
}
