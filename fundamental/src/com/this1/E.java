package com.this1;

public class E {
E()
{
	
	System.out.println("e 0 arg Con");
	
}
E(int i){
	
	System.out.println("e int arg Con");
	
	}

void m1()
{
	this(10);
	System.out.println("m1-E");
}