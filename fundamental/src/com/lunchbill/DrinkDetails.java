package com.lunchbill;

import java.util.Scanner;

public class DrinkDetails {

	static int bill=0;
	int sprite_price=7;
	int sprite_can=0;
	int sprite_bill=0;
	int thumsup_price=15;
	int thumsup_can=0;
	int thumsup_bill=0;
	int pepsi_price=20;
	int pepsi_scoop=0;
	int pepsi_bill=0;
	int tea_price=9;
	int tea_cup=0;
	int tea_bill=0;
	int coffee_price=11;
	int coffee_cup=0;
	int coffee_bill=0;
	int hotchocolate_price=20;
	int hotchocolate_cup=0;
	int hotchocolate_bill=0;
	
  
   
    
    void GetSprite()
    { 
    	System.out.println("How many sprite cans  do you want");
	    Scanner sc=new Scanner(System.in);
		int sprite_can=sc.nextInt();
		sprite_bill=sprite_price*sprite_can;
		bill+=sprite_bill;
		
    	
    	
    }
    void GetThumsUp()
    { 
    	System.out.println("How many thumsup cans  do you want");
	    Scanner sc=new Scanner(System.in);
		int thumsup_can=sc.nextInt();
		thumsup_bill=thumsup_price*thumsup_can;
		bill+=thumsup_bill;
		
    	
    	
    }
    void GetPepsi()
    { 
    	System.out.println("How many pepsi cans  do you want");
	    Scanner sc=new Scanner(System.in);
		int pepsi_can=sc.nextInt();
		pepsi_bill=pepsi_price*pepsi_can;
		bill+=pepsi_bill;
		
		
    	
    } 
    
  	void GetSoftDrinkDetails()
	{   DrinkDetails obj=new DrinkDetails();
  		while(true) {
		System.out.println("--------------------------------");
		System.out.println("        1)Sprite                ");
		System.out.println("        2)ThumsUp               ");
		System.out.println("        3)Pepsi                 ");
		System.out.println("        4)Back                  ");
		System.out.println("--------------------------------");
		System.out.println("please enter which softdrink do you want");
		 Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{ 
		case 1:
			obj.GetSprite();
			break;
		case 2:
			obj.GetThumsUp();
			break;
		case 3:
			obj.GetPepsi();
			break;
		case 4:
			
			 bill+=obj.DrinkTotal(bill);

		
		
		}
	}
	}
    
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
    
  
	void GetHotDrinkDetails()
	{   DrinkDetails obj=new DrinkDetails();
		while(true)
	{
		System.out.println("--------------------------------");
		System.out.println("        1)Tea               ");
		System.out.println("        2)Coffee               ");
		System.out.println("        3)HotChocolate                ");
		System.out.println("        4)Back                  ");
		System.out.println("--------------------------------");
		System.out.println("please enter which hotdrink do you want");
		Scanner sc=new Scanner(System.in);
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
			
			 bill+=obj.DrinkTotal(bill);
		
		}
		}
	}
	 int DrinkTotal(int bill1)
	   { bill=bill1; 
		 GetDrinkDetails();
		   
		   return bill;
	   }
	void GetDrinkDetails()
	{    
		DrinkDetails obj=new DrinkDetails();
		while(true)
			{Scanner sc=new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("        1)SoftDrink             ");
		System.out.println("        2)HotDrink              ");
		System.out.println("        3)Back                  ");
		System.out.println("--------------------------------");
		System.out.println("please enter which Drink do you want");
		int choice=sc.nextInt();
		switch(choice)
		{ 
		case 1:
			obj.GetSoftDrinkDetails();
			break;
		case 2:
			obj.GetHotDrinkDetails();
			break;
		case 3:
			
			BriyaniClient bc = new BriyaniClient();
			bc.TotalBill(bill);
		
		}
		}
	}
	
}
