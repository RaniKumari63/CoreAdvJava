package com.parentchild;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent6 p=new Parent6();
p.m1();
Child6 c=new Child6();
c.m1();
Parent6 p6=new Child6();
	p6.m1();	
	}

}
