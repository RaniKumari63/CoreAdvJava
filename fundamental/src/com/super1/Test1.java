package com.super1;

class A{ 
int i=100; 
int j=200; 
} 
class B extends A{ 
int i=10; 
int j=20; 
B(int i,int j){ 
System.out.println(i+" "+j); 
System.out.println(this.i+" "+this.j); 
System.out.println(super.i+" "+super.i); 
}
} 
class Test1{ 
public static void main(String args[]){ 
B b=new B(50,60); 
}
}