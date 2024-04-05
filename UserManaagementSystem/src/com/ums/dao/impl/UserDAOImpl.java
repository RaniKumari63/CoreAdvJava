package com.ums.dao.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.ums.dao.UserDAO;
import com.ums.pojo.User;

public class UserDAOImpl implements UserDAO{
	Scanner sc=new Scanner(System.in);
	User user=null;

	public void register() {
		ArrayList al=new ArrayList();
		System.out.println("Enter First Name");
		String fname=sc.next();
		System.out.println("Enter Last Name");
		String lname=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		System.out.println("Enter MobileNumber");
		long mno=sc.nextLong();
		 user=new User(fname,lname,email,pass,mno);
         al.add(user);
		
		System.out.println("User Registered Successfully");
		
	}
	public boolean verifyUnAndPw(String email,String pass) {
	
		if((user.getEmail().equals(email))&&(user.getPassword().equals(pass)))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public String forgotPassword(String email)
	{  String pass=null;
		if(user.getEmail().equals(email))
		{
			System.out.println("Please enter new password");
			pass=sc.next();
		}
		else{
			System.out.println("Please enter valid email");
		
		}
		return pass;
	}
}
