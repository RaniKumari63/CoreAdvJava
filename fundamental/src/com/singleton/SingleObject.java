package com.singleton;

public class SingleObject {

	private static 	SingleObject instance1=new SingleObject();
	private SingleObject()
	{
		
	}
	public static SingleObject getInstance()
	{
		return instance1;
	}
	public void showMessage()
	{
		System.out.println("hellodasda");
	}
	
}
