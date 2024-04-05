package com.typecasting;

class A2{ 
void m1(){ 
System.out.println("m1-A"); 
}
} 
class B2 extends A2{ 
void m2(){ 
System.out.println("m2-B"); 
}
} 
class Test2{ 
public static void main(String args[]){ 

 A2 a=new A2(); 
 
 //B2 b=(B2)a; //class cast exception
 
 A2 a1=new B2();
 B2 b=(B2)a;
 b.m1();
 b.m2();
}
}