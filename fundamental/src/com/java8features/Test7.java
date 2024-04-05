package com.java8features;
interface Interf6
{
	public void m1();
}
public class Test7 {
int x=777;


public void m2()
{Interf6 i=()->
{int x=888;
System.out.println(x);
System.out.println(this.x);
	
};
i.m1();	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test7 t=new Test7();
t.m2();
	}

}
