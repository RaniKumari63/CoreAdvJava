package com.exception1;

import java.io.PrintWriter;

class Test20 
{
	
	
	public static void main(String[] args)throws InterruptedException{
	doStuff();
	}
	public static void doStuff()throws InterruptedException{
	doMoreStuff();
	}
	public static void doMoreStuff()throws InterruptedException{ 
	Thread.sleep(500000);

	}
}
