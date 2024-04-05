package com.innerclass1;

public class TestNestedInterface2 implements A1.Message {
public void msg()
{
	System.out.println("Hello nested interface");
}
public static void main(String args[])
{
	A1.Message m=new TestNestedInterface2();
	m.msg();
}

}
