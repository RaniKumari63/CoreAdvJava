package com.exception1;

import java.io.PrintWriter;

class Test27 
{
	
	
	public static void main(String[] args)throws Exception{
		int[] x=new int[10];
		System.out.println(x[0]);//valid
		System.out.println(x[100]);//AIOOBE
		System.out.println(x[-100]);//AIOOBE
		String s=null;
		System.out.println(s.length());

	}
}
