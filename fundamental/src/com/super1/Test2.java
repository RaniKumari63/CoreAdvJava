package com.super1;

class A2{ 
A2(){ 
System.out.println("A-Con"); 
} 
A2(int i){ 
System.out.println("A-int-param-Con"); 
}
} 
class B2 extends A2{ 
B2(){ 
super(10); 
System.out.println("B-Con"); 
}
} 
class Test2{ 
public static void main(String args[]){ 
B2 b=new B2(); 
}
}
