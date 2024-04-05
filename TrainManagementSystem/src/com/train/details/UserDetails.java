package com.train.details;
import java.util.Scanner;

import com.train.DAOImpl.UserDaoImpl;
import com.train.client.OnlineClient;
import com.train.pojo.User;

	public class UserDetails {
	UserDaoImpl uimpl=new UserDaoImpl();
	BookingDetails bd=new BookingDetails();
Scanner sc=new Scanner(System.in);

	public void menuDetails()
	{
	   while(true)
	 {
     System.out.println("-----------------------------------");
	 System.out.println("----1)Registration-----------------");
	 System.out.println("----2)Booking----------------------");
	 System.out.println("----3)PnrStatus--------------------");
	 System.out.println("----4)Help-------------------------");
	 System.out.println("----5)Back-------------------------");
	System.out.println("Enter the choice");
	 int choice=sc.nextInt();
  switch(choice)
  {
  case 1:uimpl.addUser();
  
	  break;
  case 2:
	  System.out.println("Enter your Email Id");
	  String bemail=sc.next();
	  System.out.println("Enter your password");
	  String bpwd=sc.next();
	  int k=0;
	  for(User u:uimpl.user)
	  {
	  if((u.getUemail().equals(bemail))&&(u.getPassword().equals(bpwd)))
	  {   ++k;
	  
	  bd.menuDetails(u.getUid(),u.getUname());
	  break;
	  }
	  }
	     if(k==0)
		  System.out.println("Please Enter Valid Username and Password");
	  
	  break;
  case 3:
	  break;
  case 4:
	  break;
  case 5:
	  OnlineClient oc=new OnlineClient();
	  oc.main(null);
	  break;
	  
  
  


	 }
	}
	}
}