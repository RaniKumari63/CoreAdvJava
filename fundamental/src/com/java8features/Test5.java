package com.java8features;
interface interf3{
	public int square(int x);
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf3 i=x->x*x;
		System.out.println("the square of 5 is:"+i.square(5));

	}

}
