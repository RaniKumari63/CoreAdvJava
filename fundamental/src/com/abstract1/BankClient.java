package com.abstract1;

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Axis ab=new Axis();
		int interest=ab.getRateofInterest();
		System.out.println(interest);
		Bank b=new Axis();
		int interest1=b.getRateofInterest();
		System.out.println(interest1);
	}

}
