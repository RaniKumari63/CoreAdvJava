package com.typecasting;
class A3
{
	
}
class B3 extends A3
{
	
}
class C3 extends B3
{
	
}
class D3 extends C3
{
	
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A3 a=new A3();
//B3 b=a;
	
A3 a1=new A3();
//B3 b1=(B3)a1;
 A3 a2=new B3();
 B3 b2=(B3)a2;
 
 A3 a3=new C3();
 B3 b3=(C3)a3;
	}

}
