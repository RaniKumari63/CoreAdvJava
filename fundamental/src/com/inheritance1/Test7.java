package com.inheritance1;

class A7{ 
A7(){ 
System.out.println("A-con"); 
}
} 
class B7 extends A7{ 
B7(){ 
System.out.println("B-con"); 
}
} 
class C7 extends B7{ 
C7(){ 
System.out.println("C-con"); 
}
} 
class Test7{ 
public static void main(String[] args){ 
C7 c=new C7(); 
}
} 
