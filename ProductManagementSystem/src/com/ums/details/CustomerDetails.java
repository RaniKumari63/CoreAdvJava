package com.ums.details;

import java.util.Scanner;

import com.pms.DAOImpl.CustomerDaoImpl;
import com.pms.DAOImpl.ProductDaoImpl;

public class CustomerDetails {
	
	Scanner sc=new Scanner(System.in);
	ProductDaoImpl pimpl=new ProductDaoImpl();
	CustomerDaoImpl cimpl=new CustomerDaoImpl();
	AdminDetails ad=new AdminDetails();
	public void customDetails()
	{  while(true) {
		System.out.println("---------------------------------- ");
		System.out.println("----------1)viewProducts-----------");
		System.out.println("----------2)viewProduct------------");
		System.out.println("----------3)buyProduct-------------");
		System.out.println("----------4)Back-------------------");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:pimpl.viewAllProduct();
			break;
		case 2:
			System.out.println("Enter email");
			String email1=sc.next();
			System.out.println("Enter password");
			String pass=sc.next();
			boolean value=pimpl.verifyUnAndPw(email1, pass);
			if(value==true)
				{
				System.out.println("Enter product id");
				int pid=sc.nextInt();
				pimpl.viewProduct(pid);
				}
			else
			{
				System.out.println("Username and password is not valid");
				
			}
			
		case 3:
			System.out.println("Enter email");
			String email2=sc.next();
			System.out.println("Enter password");
			String pass2=sc.next();
			boolean value1=pimpl.verifyUnAndPw(email2, pass2);
			if(value1==true)
				{
				
				}
			else
			{
				System.out.println("Username and password is not valid");
				
			}cimpl.buyProduct();
			break;
	
		case 4:ad.menuDetails();
			break;
		default:System.out.println("Choose between 1 to 3");	
		
		}
	}
	}
	
}
