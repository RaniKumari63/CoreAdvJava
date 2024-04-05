package com.abstract5;

public class Account {
int AccNo;
long MobileNumber;
public static int money;
double  Deposit (int dmon)
{
	money+=dmon;
	return money;
}
int Withdraw(int wmon)
{
	money-=wmon;
	System.out.println("amount withdraw"+wmon+"remaining amount \t"+money);

return wmon;
}
}
