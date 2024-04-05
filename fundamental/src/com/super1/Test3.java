package com.super1;

class A6{ 
A6(){ 
System.out.println("A-con"); 
}
} 
class B6 extends A6{ 
B6(int i){ 
System.out.println("B-int-param-con"); 
}
} 
class C6 extends B6{ 
C6(int i){ 
System.out.println("C-int-param-con"); 
}
} 
class Test3{ 
public static void main(String args[]){ 
C6 c=new C6(); 
}
} 


