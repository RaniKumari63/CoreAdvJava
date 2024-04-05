package com.instance;

public class B {
int j=m1();
int m2()
{
	System.out.println("m2-b");
	return 10;
}
B()
{
	System.out.println("B-con");
}
int m1()
{
	System.out.println("m1-B");
	return 20;
}

int i=m2();

}
