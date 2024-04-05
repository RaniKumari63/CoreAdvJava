package com.java45features;

public class Test1 {
static void display(int ar[])
{
	for(int i:ar)
	{
		System.out.println(i);
	}
}


static void display1(int... ar)
{
	for(int i:ar)
	{
		System.out.println(i);
	}
	
}
static void display1(String... ar)
{
	for(String i:ar)
	{
		System.out.println(i);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int ar[]=new int[] {10,20,30};
		display(ar);
		display1(ar);
		display1(500);
		display1("rani","bbb");
	}

}
