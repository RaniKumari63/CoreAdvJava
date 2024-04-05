package com.inheritance1;

class A11{ 
A11(){ 
System.out.println("A-con"); 
} 
static{ 
System.out.println("SB-A"); 
} 
int m1(){ 
System.out.println("m1-A"); 
return 10; 
} 
static int m2(){ 
System.out.println("m2-A"); 
return 20; 
} 
{ 
System.out.println("IB-A"); 
} 
static int i=m2(); 
int j=m1(); 
} 
class B11 extends A11{ 
{ 
System.out.println("IB-B"); 
}
int m3(){ 
System.out.println("m3-B"); 
return 30; 
} 
static{ 
System.out.println("SB-B"); 
} 
int k=m3(); 
B11(){ 
System.out.println("B-Con"); 
} 
static int l=m4(); 
static int m4(){ 
System.out.println("m4-B"); 
return 40; 
}
} 
class C11 extends B11{ 
static int m5(){ 
System.out.println("m5-C"); 
return 50; 
} 
int m6(){ 
System.out.println("m6-C"); 
return 60; 
} 
C11(){ 
System.out.println("C-con"); 
} 
int m6(); 
static int n=m5();{ 
System.out.println("IB-C"); 
} 
static{ 
System.out.println("SB-C"); 
} 
} 
class Test11{ 
public static void main(String args[]){ 
C11 c1=new C11(); 
C11 c2=new C11(); 
}
}