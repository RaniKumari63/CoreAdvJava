package com.streams1;

public class Test66 {

	public static void m1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r=Test66::m1;
	

Thread t=new Thread(r);
t.start();
for(int i=0;i<10;i++)
{
	System.out.println("main thread");
}
	}

}
