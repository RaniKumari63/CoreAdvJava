package com.enum1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(User_Status.AVAILABLE);
		System.out.println(User_Status.BUSY);
		System.out.println(User_Status.IDLE);
	}

	enum User_Status
	{
		AVAILABLE,BUSY,IDLE;
	}
}
