package com.Association1;

public class Transaction {

	String tid;
	String type;
	public Transaction(String tid, String type) {
		super();
		this.tid = tid;
		this.type = type;
	}
	
	public void deposit(Account1 acc,int depamt)
	{
		int initial_Amt=acc.bal; 
		int total_Avl_Amt=initial_Amt+depamt; 
		acc.bal=total_Avl_Amt; 
		System.out.println("Transaction Details"); 
		System.out.println("--------------------"); 
		System.out.println("Transaction Id :"+tid); 
		System.out.println("Account Number :"+acc.accNo); 
		System.out.println("Account Type :"+acc.accType); 
		System.out.println("Initial Amount :"+initial_Amt); 
		System.out.println("Deposit Amount :"+depamt); 
		System.out.println("Total Avl Amount :"+total_Avl_Amt); 
		System.out.println("Transaction Status:SUCCESS"); 
		System.out.println("********THANKQ,VISIT AGAIN***********");	
		
	}
	
}
