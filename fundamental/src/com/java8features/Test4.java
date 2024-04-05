package com.java8features;
interface interf1
{
	public void sum(int a,int b);
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf1 i=(a,b)->System.out.println("the sum:"+(a+b));
		i.sum(5,10);
	}

}
