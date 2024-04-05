package com.abstract5;

import java.util.Scanner;

public class CheckingAccount  {
 static int TransactionCount=0;
static int NoOfFreeTransactions=30;
static int dedfee=30;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 while(true)
	{
		System.out.println("-------------------------------");
	  System.out.println("---------1)WithDraw-------------");
	  System.out.println("---------2)Deposit---------------");
	  System.out.println("---------3)Checking Account-------");
	  System.out.println("----------4)exit------------------");
	  System.out.println("Enter option");
	 
	  int option=sc.nextInt();
		switch(option)
		{  case 1: 
			System.out.println("enter amount to be withdraw");
			
			Account a=new Account();
			if(TransactionCount>NoOfFreeTransactions)
			{
			System.out.println("Account Balance"+(a.Withdraw(sc.nextInt())-dedfee));
			}
			else
			{System.out.println("Account Balance"+a.Withdraw(sc.nextInt()));
				
			}
			TransactionCount++;
			
		 break;
		case 2:
            System.out.println("enter amount to be deposit");
			
			Account a1=new Account();
			if(TransactionCount>NoOfFreeTransactions)
			{
			System.out.println("Account Balance"+(a1.Deposit(sc.nextInt())-dedfee));
			}
			else
			{System.out.println("Account Balance"+a1.Deposit(sc.nextInt()));
				
			}
			TransactionCount++;
			break;
		case 3:
			Account a2=new Account();
			System.out.println("Account Balance"+a2.money);
			break;
		case 4:
			System.exit(0);
			default: System.out.println("choose between 1to 4");

		
	}
	}
}
}

