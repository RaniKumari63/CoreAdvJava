package com.exception1;

import java.util.Scanner;

public class AccountClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc=new Scanner(System.in);
System.out.println("enter account number");
int acc_no=sc.nextInt();
System.out.println("enter name");
try
{
	String name=sc.next();
	int i;
	for(i=0;i<name.length();i++)
	{
		char c=name.charAt(i);
		if(Character.isDigit(c)) throw new Account_Exception("Name not valid");

	}
	System.out.println("Enter Balance");
	int balance=sc.nextInt();
	if(balance>=1000 && balance<=5000) throw new Account_Exception("Balance within range");
	Account1 ac=new Account1(acc_no,name,balance);
System.out.println("details entered successfully");
}
catch(Account_Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}


	}

}
