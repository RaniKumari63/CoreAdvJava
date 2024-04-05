package com.lang2;

public class GarbageC {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		GarbageC g=new GarbageC();
		//System.out.println(g);
		System.gc();
		System.out.println(g);
		g=null;
		
	System.gc();
		System.out.println(g);
		System.out.println(g);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("to perform clean up operation");
	
	
	}

}
