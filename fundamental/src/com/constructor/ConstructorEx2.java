package com.constructor;

public class ConstructorEx2 {
int sno;
	
	// when we are specifying  parameterized constructor  we need to specify
  // default constructor ,i.e jvm wont specify any default constructor
	ConstructorEx2(int i,String str)
	{
		System.out.println("paramterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ConstructorEx2();
new ConstructorEx2();
new ConstructorEx2();
	}

}
