package com.lunch;

import java.util.Scanner;

public class BriyaniDetails {
	static int bill = 0;
	int chicken_price = 100;
	int chicken_plates = 0;
	int chicken_bill = 0;
	int veg_price = 90;
	int veg_plates = 0;
	int veg_bill = 0;
	int fish_price = 150;
	int fish_plates = 0;
	int fish_bill = 0;

	

	void GetChickenBriyani() {
		System.out.println("How many plates of chicken briyani do you want");
		Scanner sc = new Scanner(System.in);
		int chicken_plates = sc.nextInt();
		chicken_bill = chicken_price * chicken_plates;
		bill += chicken_bill;
		 
	}

	void GetVegBriyani() {
		System.out.println("How many plates of veg briyani do you want");
		Scanner sc = new Scanner(System.in);
		int veg_plates = sc.nextInt();
		veg_bill = veg_price * veg_plates;
		bill += veg_bill;
		

	}

	void GetFishBriyani() {
		System.out.println("How many plates of fish briyani do you want");
		Scanner sc = new Scanner(System.in);
		int fish_plates = sc.nextInt();
		
		fish_bill = fish_price * fish_plates;
		bill += fish_bill;
		

	}

	int BriyaniTotal(int bill1) {
		GetBriyaniDetails();
		bill += bill1;
		return bill;
	}

	void GetBriyaniDetails() {
		BriyaniDetails obj = new BriyaniDetails();
		
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("        1)ChickenBriyani        ");
			System.out.println("        2)VegBriyani            ");
			System.out.println("        3)FishBriyani           ");
			System.out.println("        4)Back                  ");
			System.out.println("--------------------------------");
			System.out.println("please enter which Briyani  do you want");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.GetChickenBriyani();

				break;
			case 2:
				obj.GetVegBriyani();
				break;
			case 3:
				obj.GetFishBriyani();
				break;
			case 4:
				
				BriyaniClient bc = new BriyaniClient();
				
				bc.TotalBill(bill);

				break;

			}
		}

	}
}
