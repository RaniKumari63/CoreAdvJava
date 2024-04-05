package com.pms.client;

import java.util.Scanner;

import com.cms.details.CustomerDetails;
import com.pms.details.AdminDetails;
import com.pms.exception.CustomerException;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
AdminDetails ad=new AdminDetails();
CustomerDetails cus=new CustomerDetails();
		while(true)
		{
			System.out.format("%21s", "1)Admin\n");
			System.out.format("%24s", "2)Customer\n");
			System.out.format("%20s", "3)Exit\n");
			System.out.println("Enter the choice");
  int choice=sc.nextInt();
  switch(choice)
  {
  case 1:ad.menuDetails();
	  break;
  case 2:try {
		cus.customDetails();
	} catch (CustomerException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	  break;
  case 3:System.exit(0);
	  break;
  default:
	  System.out.println("choose between 1 to 3");
  
  }
	}
	}

}
