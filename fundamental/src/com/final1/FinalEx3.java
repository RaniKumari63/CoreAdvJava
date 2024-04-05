package com.final1;

public class FinalEx3 {
	
	//final instance variables we should perform initialization before constructor completion,if we are performing initialization anywhere else we will get compile time error
final int i=10;
final int i2;
final int i3;
final int i4;
{
	i2=5;
}
FinalEx3()
{
	i3=0;
}

/*
 * public void m1() { i4=60; }
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
