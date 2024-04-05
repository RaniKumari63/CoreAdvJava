package com.constructor;

public class ConstructorEx4 {
	
	ConstructorEx4(double d)
	{
		System.out.println("double-argument constructor");
	}
	ConstructorEx4(int i)
	{ this(10.5);
	System.out.println("int-argument constructor");
		
	}
	ConstructorEx4()
	{ this(10);
	System.out.println("no-argument constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx4 c1=new ConstructorEx4();
		ConstructorEx4 c2=new ConstructorEx4(10);
		ConstructorEx4 c3=new ConstructorEx4(10.5);
		
		
		
		
	}

}
