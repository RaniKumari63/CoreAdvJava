package com.static1;

class A7{ 
static int i=m2(); 
static int m1(){ 
System.out.println("m1-A"); 
return 10; 
} 
static{ 
System.out.println("SB-A"); 
} 
static int m2(){ 
System.out.println("m2-A"); 
return 20; 
} 
static int j=m1(); 
} 
