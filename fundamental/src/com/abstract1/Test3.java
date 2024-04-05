package com.abstract1;

abstract class A5 {
	abstract void m1();

	abstract void m2();

	abstract void m3();
}
abstract class B5 extends A5{ 
	void m1(){ 
		System.out.println("m1-A"); 
		}
}
class C5 extends B5{ 
void m2(){ 
System.out.println("m2-C"); 
} 
void m3(){ 
System.out.println("m3-C"); 
}
} 
public class Test3 {

	public static void main(String args[]){ 
		A5 a=new C5(); 
		a.m1(); 
		a.m2();
		a.m3(); 
		
		}
		} 

