package com.lunchbill;

import java.util.Scanner;

public class SoftDrink {


	int bill=0;
	int sprite_price=7;
	int sprite_can=0;
	int sprite_bill=0;
	int thumsup_price=15;
	int thumsup_can=0;
	int thumsup_bill=0;
	int pepsi_price=20;
	int pepsi_scoop=0;
	int pepsi_bill=0;
	SoftDrink obj=new SoftDrink();
    Scanner sc=new Scanner(System.in);
    
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
    
   int getBill( )
    {
      return bill;
    }
	void GetSoftDrinkDetails()
	{
		System.out.println("--------------------------------");
		System.out.println("        1)Sprite                ");
		System.out.println("        2)ThumsUp               ");
		System.out.println("        3)Pepsi                 ");
		System.out.println("        4)Back                  ");
		System.out.println("--------------------------------");
		System.out.println("please enter which softdrink do you want");
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
			System.exit(0);
		
		
		}
	}

}
