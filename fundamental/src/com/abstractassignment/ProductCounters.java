package com.abstractassignment;

import java.util.Scanner;

public class ProductCounters {
static int product;
static String productno;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to our market"+"\n"+"enter yourchoice ");
		System.out.println("1.ProductOne"+"\n"+"2.ProductTwo"+"\n"+"3.ProductThree");
		product = sc.nextInt();
		if(product==1)
		{
			Pcounter c1=new Counterone();
			productno="ProductOne";
			c1.process();
		}
		else if(product==2)
		{
			Pcounter c2=new Counterone2();
			productno="Producttwo";
			c2.process();
		}
		else if(product==3)
		{
			Pcounter c3=new Counterone3();
			productno="Productthree";
			c3.process();
		}
		
	}

}
