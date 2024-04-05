package com.parentchild;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Parent9 p=new Parent9();
	p.m1(10);
	Child9 c=new Child9();
	c.m1(9);
	Parent9 p1=new Child9();
	p1.m1(8);
	}

}
