package com.inheritance1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Parent();
p.m1();
//p.m2(); //child method is not accesssible to parent class

Child c=new Child();
c.m1();
c.m2();
Parent p1=new Child();
p1.m1();
//p1.m2();
//Child c1=new Parent();
	}

}
