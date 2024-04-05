package com.Association1;

public class Test {
	public static void main(String[] args){ 
		Account1 acc=new Account1("abc123","Durga","Savings"); 
		Transaction tx=new Transaction("T-111","Deposit"); 
		tx.deposit(acc,5000); 
		}

}
