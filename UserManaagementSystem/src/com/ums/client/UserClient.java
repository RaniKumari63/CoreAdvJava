package com.ums.client;

import java.util.Scanner;

import com.ums.dao.impl.UserDAOImpl;
import com.ums.pojo.User;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
UserDAOImpl userimpl=new UserDAOImpl();
User user=new User();

while(true)
{
	System.out.println("----------------------------------");
	System.out.println("----------1)Register--------------");
	System.out.println("----------2)Login-----------------");
	System.out.println("----------3)ForgotPassword--------");
	System.out.println("----------4)Exit------------------");
	System.out.println("Enter choice");
	int choice=sc.nextInt();
	switch(choice)
	{ case 1:userimpl.register();
		break;
	case 2:
		System.out.println("Please Enter email");
		String email=sc.next();
		System.out.println("Please Enter password");
		String pass=sc.next();
		boolean login=userimpl.verifyUnAndPw(email, pass);
		if(login==true)
		{
			System.out.println("Login Succesfully");
			
		}
		else
		{
			System.out.println("Login Failed");
			
		}
		break;
	case 3:
		System.out.println("Please enter email ");
		String email1=sc.next();
		String password=userimpl.forgotPassword(email1);
		user.setPassword(password);
		break;
	case 4:
		System.out.println("Thx for App");
		System.exit(0);
		break;
	default:
		System.out.println("Choose 1 to 4 Between");
	
	}
}
	}

}
