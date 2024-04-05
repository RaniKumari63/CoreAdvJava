package com.interface1;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// I i=new I(); 
		I i=new A5();
			System.out.println(I.x);
			//we can call interface variable using class name because they static variable
			System.out.println(i.x);
			i.m1();
			i.m2();
			i.m3();
		//	i.m4();
			A5 a=new A5();
			System.out.println(A5.x);
			System.out.println(a.x);
			a.m1();
			a.m2();
			a.m3();
			a.m4();
			

	}

}
