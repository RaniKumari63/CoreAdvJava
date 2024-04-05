package com.innerclass1;

public class Test1 {

	
	
	public void m1()
	{
		class Inner
		{
			public void sum(int i,int j)
			{
				System.out.println("The sum:"+(i+j));
			}
		}
		Inner i=new Inner();	
		i.sum(10, 20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Test1().m1();
	}

}
