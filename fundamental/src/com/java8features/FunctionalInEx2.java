package com.java8features;
interface Addtion
{
	int add(int fno,int sno);
}
interface Substraction
{
	void sub();
}
interface Multiplication
{
	void mul(int m,int n);
}

public class FunctionalInEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	X x=new X()
			{
		public void display(String msg)
		{
			System.out.println(msg);
		}

	

		@Override
		public void saybye(String msg) {
			// TODO Auto-generated method stub
			System.out.println(msg);
		}
		
			};
			x.display("focus more");
			x.saybye("say bye");
	}

	
	
	
}
