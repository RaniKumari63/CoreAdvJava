package com.lunchbill;

import java.util.Scanner;

public class IceCreamDetails {

	static int bill=0;
	int vanilla_price=10;
	int vanilla_scoop=0;
	int vanilla_bill=0;
	int chocolate_price=15;
	int chocolate_scoop=0;
	int chocolate_bill=0;
	int buttersc_price=20;
	int buttersc_scoop=0;
	int buttersc_bill=0;
	
    
    
    void GetVanillaIceCream()
    { 
    	System.out.println("How many scoops of vanilla ice cream do you want");
	    Scanner sc=new Scanner(System.in);
		int vanilla_scoop=sc.nextInt();
		vanilla_bill=vanilla_price*vanilla_scoop;
		bill+=vanilla_bill;
		    	
    }
    void GetChocolateIceCream()
    { 
    	System.out.println("How many scoops of chocolate ice cream do you want");
	    Scanner sc=new Scanner(System.in);
		int chocolate_scoop=sc.nextInt();
		chocolate_bill=chocolate_price*chocolate_scoop;
		bill+=chocolate_bill;
		
    	
    }
    void GetButterScotchIceCream()
    { 
    	System.out.println("How many scoops of butterscotch ice cream  do you want");
	    Scanner sc=new Scanner(System.in);
		int buttersc_scoop=sc.nextInt();
		buttersc_bill=buttersc_price*buttersc_scoop;
		bill+=buttersc_bill;
		
    	
    }
   int IceCreamTotal(int bill1)
   {  bill=bill1;
	   GetIceCreamDetails();
	   
	   return bill;
   }
	void GetIceCreamDetails()
	{  IceCreamDetails obj=new IceCreamDetails();
		while(true) {
		System.out.println("--------------------------------");
		System.out.println("        1)VanilaIceCream       ");
		System.out.println("        2)ChocolateIceCream          ");
		System.out.println("        3)ButterScotchIceCream           ");
		System.out.println("        4)Back                  ");
		System.out.println("--------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter which IceCream do you want");
		int choice=sc.nextInt();
		switch(choice)
		{ 
		case 1:
			obj.GetVanillaIceCream();
			break;
		case 2:
			obj.GetChocolateIceCream();
			break;
		case 3:
			obj.GetButterScotchIceCream();
			break;
		case 4:
			
			BriyaniClient bc = new BriyaniClient();
			bc.TotalBill(bill);
		
		
		}
	}
	}
}
