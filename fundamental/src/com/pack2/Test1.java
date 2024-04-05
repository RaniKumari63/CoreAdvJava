package com.pack2;
import com.pack1.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
t.m1();
//Test2 t1=new Test2(); //default class cannot access outside the package
//t1.m1();
//t.m5() //cannot access outside the package
//t.m6() ; //protected method cannot access outside the package
Test3 t3=new Test3();
t3.m1();

	}

}

class Test3
{
	public void m1() {
		System.out.println("m1 tet3 same package");
	}
}