package com.this1;

public class Test9 {

	int i;
	Test9()
	{  this(10);
		System.out.println("no arg constructor");
	}
	Test9(int a)
	{
		System.out.println("1 arg constructor");
	}
	void setValue(int i)
	{
		//i=i;
		this.i=i;
		
	}
	void show()
	{
		System.out.println(i);
		display();
		this.display();
	}
	
	void display()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test9 t=new Test9();
t.setValue(100);
t.show();

	}

}
