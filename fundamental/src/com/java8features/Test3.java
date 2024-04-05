package com.java8features;
interface interf
{
	void m1();
	
}
public  class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
interf i=()->System.out.println("m1 execution");
i.m1();
	}

}
