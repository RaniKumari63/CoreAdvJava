package com.parentchild;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent10 p=new Parent10();
		System.out.println(p.x);
		Child10 c=new Child10();
		System.out.println(c.x);
		Parent10 p1=new Child10();
		System.out.println(p1.x);
		
	}

}
