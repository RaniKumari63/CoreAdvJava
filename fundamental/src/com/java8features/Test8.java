package com.java8features;

interface Interf9 { 
 public void m1(); 
 } 
 class Test8 { 
 int x = 10; 
 public void m2() { 
 int y = 20; 
 Interf9 i = () -> { 
 System.out.println(x);
 //System.out.println(y); 
 x = 888;
 //y = 999; //CE 
 }; 
 i.m1(); 
 y = 777; 
 } 
 public static void main(String[] args) { 
 Test8 t = new Test8(); 
 t.m2(); 
 } 
} 
 