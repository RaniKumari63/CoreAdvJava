package com.inheritance1;

class A8{ 
A8(){ 
System.out.println("A-con"); 
}
} 
class B8 extends A8{ 
} 
class C8 extends B8{ 
C8(){ 
System.out.println("C-con"); 
}
} 
class Test9{ 
public static void main(String[] args){ 
C8 c=new C8(); 
}
} 
