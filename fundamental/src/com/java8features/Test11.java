package com.java8features;
interface Interf11
{
	public static void sum(int a,int b)
	{
		System.out.println("the sum:"+(a+b));
	}
}
public class Test11  implements Interf11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test11 t=new Test11();
//t.sum(10,20);
//Test11.sum(10,20);
Interf11.sum(10,20);

	}

}
