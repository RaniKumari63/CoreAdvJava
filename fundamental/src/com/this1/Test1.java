package com.this1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u=new User();
		u.setUname("abc");
		u.setUpwd("abc123");
		System.out.println("user login details");
		System.out.println("------------------");
		System.out.println("username"+u.getUname());
		System.out.println("password"+u.getUpwd());
		
	}

}
