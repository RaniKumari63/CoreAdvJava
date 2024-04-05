package com.java8features;

interface Interf0 { 
 default void m1() { 
 System.out.println("Default Method"); 
 } 
 }
public class Test9 implements Interf0{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test9 t=new Test9();
t.m1();
	}

}
