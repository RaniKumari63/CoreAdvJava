package com.lunchbill;

import java.util.Scanner;

public class HotDrink {

	int bill=0;
	int tea_price=9;
	int tea_cup=0;
	int tea_bill=0;
	int coffee_price=11;
	int coffee_cup=0;
	int coffee_bill=0;
	int hotchocolate_price=20;
	int hotchocolate_cup=0;
	int hotchocolate_bill=0;
	HotDrink obj=new HotDrink();
    Scanner sc=new Scanner(System.in);
    
    void GetTea()
    { 
    	System.out.println("How many cups of tea  do you want");
	    Scanner sc=new Scanner(System.in);
		 tea_cup=sc.nextInt();
		tea_bill=tea_price*tea_cup;
		bill+=tea_bill;
    	
    	
    }
    void GetCoffee()
    { 
    	System.out.println("How many cups of coffee  do you want");
	    Scanner sc=new Scanner(System.in);
		 coffee_cup=sc.nextInt();
		coffee_bill=coffee_price*coffee_cup;
		bill+=coffee_bill;
    	
    	
    }
    void GetHotChocolate()
    { 
    	System.out.println("How many cups of hot chocolate  do you want");
	    Scanner sc=new Scanner(System.in);
	    hotchocolate_cup=sc.nextInt();
	    hotchocolate_bill=hotchocolate_price*hotchocolate_cup;
		bill+=hotchocolate_bill;
    	
    	
    } 
    
   int getBill( )
    {
      return bill;
    }
	void GetHotDrinkDetails()
	{
		System.out.println("--------------------------------");
		System.out.println("        1)Tea               ");
		System.out.println("        2)Coffee               ");
		System.out.println("        3)HotChocolate                ");
		System.out.println("        4)Back                  ");
		System.out.println("--------------------------------");
		System.out.println("please enter which hotdrink do you want");
		int choice=sc.nextInt();
		switch(choice)
		{ 
		case 1:
			obj.GetTea();
			break;
		case 2:
			obj.GetCoffee();
			break;
		case 3:
			obj.GetHotChocolate();
			break;
		case 4:
			System.exit(0);
		
		
		}
	}
}
