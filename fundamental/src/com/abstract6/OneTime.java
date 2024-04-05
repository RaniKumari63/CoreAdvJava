package com.abstract6;

import java.util.Scanner;

public class OneTime extends Fare {
	Scanner sc=new Scanner(System.in);
int CalculateFare() {
		System.out.println("Amount to be paid");
		
		fare=sc.nextInt();
		return fare;
		}
}
