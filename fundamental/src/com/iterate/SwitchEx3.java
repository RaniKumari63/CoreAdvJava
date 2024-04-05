package com.iterate;

import java.util.Scanner;

public class SwitchEx3 {
	void fun() {
		System.out.println("please enter first number");
		Scanner sc3 = new Scanner(System.in);
		int num1 = sc3.nextInt();
		System.out.println("please enter second number");
		Scanner sc4 = new Scanner(System.in);
		int num2 = sc3.nextInt();

	
			System.out.println("-----------------------------------");
			System.out.println("          1.Add                     ");
			System.out.println("          2.SUB                      ");

			System.out.println("---------------------------------------");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println(num1 + num2);
				 System.out.println("do you want to continue(y/n)");
				Scanner sc1 = new Scanner(System.in);
				String str = sc1.next();

				if (str.equalsIgnoreCase("y")) {
					SwitchEx3 obj1 = new SwitchEx3();
					obj1.fun();

				} else {
					System.exit(0);
				}
				break;
			case 2:
				System.out.println(num1 - num2);
				 System.out.println("do you want to continue(y/n)");
				Scanner sc5 = new Scanner(System.in);
				String str4 = sc5.next();

				if (str4.equalsIgnoreCase("y")) {
					SwitchEx3 obj2 = new SwitchEx3();
					obj2.fun();

				} else {
					System.exit(0);
				}
				break;
			default:
				System.out.println("thanks for using app");

			}

		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchEx3 obj = new SwitchEx3();

		obj.fun();

	}

}
