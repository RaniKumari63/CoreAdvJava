package com.inheritance1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test1 t=new Test1();
		System.out.println(t);
		//Test t1=(Test1)Class.forName("Test1").newInstance();
		
		Test1 t1=new Test1();
		Test1 t3=(Test1)t1.clone();
		
	}

}
