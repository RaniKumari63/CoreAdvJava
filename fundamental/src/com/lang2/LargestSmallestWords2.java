package com.lang2;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestWords2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();

		largestsmallestwords(str);
	}

	static void largestsmallestwords(String str9) {
		str9 = str9.toLowerCase();
		String maxword=" ";
		String minword=" ";
		String[] words = str9.split(" ");
		for (int i = 0; i < words.length; i++) {

			for (int j = i + 1; j < words.length; j++) {
 
				if (words[i].length() > words[j].length())

					maxword = words[i];

				else

					maxword = words[j];
				
				if (words[i].length() < words[j].length())

					minword = words[i];

				else

					minword = words[j];
			}

		}
		System.out.print("largest word \t"+maxword+"\t");
		System.out.print("smallest word\t"+minword+"\t");

	}
}
