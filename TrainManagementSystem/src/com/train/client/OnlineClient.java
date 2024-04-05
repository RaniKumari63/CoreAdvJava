package com.train.client;
import com.train.DAOImpl.AdminDaoImpl;
import com.train.details.*;
import java.util.Scanner;

public class OnlineClient {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDaoImpl aimpl=new AdminDaoImpl();
		AdminDetails ad=new AdminDetails();
		UserDetails ud=new UserDetails();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
System.out.println("--------------------------------------------");
System.out.println("----------------1)Admin---------------------");
System.out.println("----------------2)User----------------------");
System.out.println("----------------3)PNR Status----------------");
System.out.println("----------------4)Seat Availability---------");
System.out.println("----------------5)Enquiry-------------------");
System.out.println("----------------6)Train Chart---------------");
System.out.println("----------------7)Exit----------------------");
System.out.println("Enter the choice");
int choice=sc.nextInt();
switch(choice)
{ 
case 1:
	boolean value=false;
	System.out.println("Enter UserName ");
	String uname=sc.next();
	System.out.println("Enter Password");
	String passw=sc.next();
	value=aimpl.verifyUserAndPw(uname,  passw);
	if(value==true)
	{
	ad.menuDetails();
	}
	else
	{
		System.out.println("Invalid UserName and Password");
	}
	break;
case 2:ud.menuDetails();
	break;
case 3:
	break;
case 4:
	break;
	
case 5:
	break;
	
case 6:
	break;
case 7: System.out.println("");
	System.exit(0);
	default:System.out.println("Thanks for using App");
	

}
		}
	}

}
