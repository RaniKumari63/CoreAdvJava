package com.abstract1;

abstract class A6{ 
	void m1(){ 
		System.out.println("m1-A"); 
		}
		}  
class B6 extends A6{ 
	void m2(){ 
		System.out.println("m2-B"); 
		}

} 


public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 a=new B6(); 
		a.m1(); 
		//a.m2();---------->Error 
		B6 b=new B6(); 
		b.m1(); 
		b.m2(); 
	}

}
