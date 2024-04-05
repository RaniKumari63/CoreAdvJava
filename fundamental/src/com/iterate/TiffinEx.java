package com.iterate;

import java.util.Scanner;

public class TiffinEx {
	int poori_price=70;
	int poori_bill;
	
	int dosa_price=60;
	int dosa_bill;
	
	
	int bonda_price=80;
	int bonda_bill;
	
	int total_bill;
	
	void poori()
	{
		System.out.println("How many plates of poori do you want");
	    Scanner sc=new Scanner(System.in);
		int pooriplates=sc.nextInt();
		poori_bill=poori_price*pooriplates;
		total_bill+=poori_bill;
	}

	void dosa()
	{
		System.out.println("How many plates of dosa do you want");
	    Scanner sc=new Scanner(System.in);
		int dosaplates=sc.nextInt();
		dosa_bill=dosa_price*dosaplates;
		total_bill+=dosa_bill;
	}
	void bonda()
	{
		System.out.println("How many plates of bonda do you want");
	    Scanner sc=new Scanner(System.in);
		int bondaplates=sc.nextInt();
		bonda_bill=bonda_price*bondaplates;
		total_bill+=bonda_bill;
	}
	void bill()
	{
		System.out.println("total bill need to pay"+total_bill);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiffinEx obj=new TiffinEx();
		Scanner sc=new Scanner(System.in);
while(true)
{
		System.out.println("--------------------------------");
		System.out.println("            1)Poori              ");
		System.out.println("            2)Dosa              ");
		System.out.println("            3)Bonda              ");
		System.out.println("            4)Bill              ");
		System.out.println("            5)Exit              ");
		System.out.println("--------------------------------");
		System.out.println("enter choice");
		
		int  choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			obj.poori();
			break;
		case 2:
			obj.dosa();
			 break;
		case 3:
			obj.bonda();
			break;
		case 4:
			obj.bill();
			break;
		case 5:
			System.out.println("Thx for using App");
			System.exit(0);
		default:
			 System.out.println("Choose 1 to 5 between");
		}
	}



}
}
