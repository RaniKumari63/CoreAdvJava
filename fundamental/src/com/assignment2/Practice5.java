package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5 {

	String getFibonacciSeries(int no) {
		String value = "";
		int current = 0;
		int prev = 1;
		int beprev = 0;
		if(no<=0) {
			value=-1+" ";
		}
		else {
		for (int i = 0; i < no; ++i) {
			if (i == 0) {
                 value += beprev + ",";
			}
			if (i == 1)

			{

				value += prev ;
			}

			if (i > 1) {
				current = prev + beprev;
         
				beprev = prev;
				prev = current;
				if(current>90)
				{ break;
				
				}
				value += ","+current ;
			}
		}
	}
		return value;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice5 p5 = new Practice5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int total = sc.nextInt();
		String str = p5.getFibonacciSeries(total);
		System.out.println(str);
	}

}
