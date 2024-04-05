package com.java8features;

interface X
{
	void display(String msg);
	void saybye(String msg);
}
public class FunctionalInEx implements X{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInEx fun=new FunctionalInEx();
		fun.display("focus more now onwords");
	}

	@Override
	public void display(String msg) {
		// TODO Auto-generated method stub
		System.out.println("display the data");
	}

	@Override
	public void saybye(String msg) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
