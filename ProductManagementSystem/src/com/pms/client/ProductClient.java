package com.pms.client;

import java.util.Scanner;

import com.ums.details.AdminDetails;
import com.ums.details.CustomerDetails;

public class ProductClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AdminDetails ad =new AdminDetails();
		CustomerDetails cus=new CustomerDetails();
		// TODO Auto-generated method stub
		while(true)
		{
  System.out.println("------------------------------");
  System.out.println("-----------1)Admin------------");
  System.out.println("-----------2)Customer---------");
  System.out.println("-----------3)Exit-------------");
  System.out.println("Enter the choice");
  int choice=sc.nextInt();
  switch(choice)
  {
  case 1:ad.menuDetails();
	  break;
  case 2:cus.customDetails();
	  break;
  case 3:System.exit(0);
	  break;
  default:
	  System.out.println("choose between 1 to 3");
  
  }
	}

	}
}
