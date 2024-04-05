package com.inheritance1;
class A10{ 
A10(){ 
System.out.println("A-con"); 
} 
int i=m1(); 
int m1(){ 
System.out.println("m1-A"); 
return 10; 
} 
{ 
System.out.println("IB-A"); 
}
} 
class B10 extends A10{ 
int j=m2(); 
int m2(){ 
System.out.println("m2-B"); 
return 20; 
} 
{ 
System.out.println("IB-B"); 
} 
B10(){ 
System.out.println("B-Con"); 
}} 
class C10 extends B10{ 
C10(){ 
System.out.println("C-con"); 
} 
{ 
System.out.println("IB-C"); 
} 
int k=m3(); 
int m3(){ 
System.out.println("m3-C"); 
return 30; 
}
} 
class Test10{ 
public static void main(String args[]){ 
C10 c=new C10(); 
}
} 

