package com.typecasting;

class A1{ 
void m1(){ 
System.out.println("m1-A"); 
}
} 
class B1 extends A1{ 
void m2(){ 
System.out.println("m2-B"); 
}
} 
class Test{ 
public static void main(String[] args){ 
B1 b=new B1(); 
b.m1(); 
b.m2();
A1 a1=new B1();
a1.m1();
A1 a=b;
a.m1();
//a.m2();
}
}
