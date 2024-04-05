package com.constructor;

class A9 {

	A9() {
		System.out.println("A-con");
	}
}

class B9 extends A9 {


	B9(int i) {
		System.out.println("B-int-param-con");
	}
	B9()
	{
		System.out.println("B-0-param-con");
	}
}

class C9 extends B9 {
	C9(int i) {
		System.out.println("C-int-param-con");
	}

}

class Test8 {
	public static void main(String args[]) {
		C9 c = new C9(10);
	}
}
