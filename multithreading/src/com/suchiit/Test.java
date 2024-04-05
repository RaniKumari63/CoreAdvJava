package com.suchiit;

public class Test extends Thread{
	public void run()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread");	
		}
	
	}
	public static void main(String arg[])
	{
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
		Thread.currentThread().setDaemon(true);
		Test t=new Test();
		//t.setDaemon(true);
	
		t.start();
	}

}
