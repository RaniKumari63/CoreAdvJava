package com.inheritance1;

class C1 extends B1{ 
static int m3(){ 
System.out.println("m3-C"); 
return 30; 
} 
static int k=m3(); 
static{ 
System.out.println("SB-C"); 
}} 