package com.assignment2;

import java.util.Scanner;

public class Practice10 {

	int getNameScore(String name) {
		int total = 0;
		char[] ch = new char[27];

		char[] ch1 = name.toCharArray();
		if ((name == null)||(name.isBlank())||(name.isEmpty())){
			total=-1;
		}
		else {
			for (int j = 0; j < ch1.length; j++) {
  if(Character.isAlphabetic(ch1[j]))
  {
	  
  
				if (Character.isLowerCase(ch1[j])) {
					for (int i = 0; i < (ch.length - 1); i++) {
						ch[i] = (char) (i + 97);
						if (ch[i] == ch1[j]) {
							{
								total += (i + 1);
							}
						}

					}
				} else {
					for (int i = 0; i < (ch.length - 1); i++) {

						ch[i] = (char) (i + 65);
						if (ch[i] == ch1[j]) {
							
                         total += (i + 1);

						}

					}
				}
  }
				else
				{
					return -1;
				}
				
			}
		}

		

		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice10 p10 = new Practice10();
		System.out.println("Enter the String value");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int value = p10.getNameScore(str);
		System.out.println(value);
	}

}
