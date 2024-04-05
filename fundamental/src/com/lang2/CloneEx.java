package com.lang2;

public class CloneEx implements Cloneable{
	int x=100;
public static void main(String[] args) throws CloneNotSupportedException
{
	
	CloneEx ex=new CloneEx();
	CloneEx ex1=ex;//shallow clone
	//we create object an object using existing object 
	CloneEx demo=(CloneEx)ex.clone();//deep clone
	demo.x=900;
	System.out.println(demo.x);
	System.out.println(ex.x);
	System.out.println(ex1.x);
	
	
	
}

}
