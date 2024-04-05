package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {

	int getFibonacciSeries(int no) {
		int value=0;
		int current = 0;
		int prev = 1;
		int beprev = 0;
		if(no<=0) {
			return -1;
		}
		else {
		for (int i = 0; i < no; ++i) {
			if (i == 0) {
                 value = beprev;
			}
			if (i == 1){
                  value = prev ;
			}

			if (i > 1) {
				current = prev + beprev;
         
				beprev = prev;
				prev = current;
				
				value=current ;
			}
		}
	}
		return value;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6 p5 = new Practice6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int total = sc.nextInt();
		int value = p5.getFibonacciSeries(total);
		System.out.println(value);
	}

}
