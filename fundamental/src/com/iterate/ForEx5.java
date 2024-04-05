package com.iterate;



public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num = 2; num <= 100; ++num) {
			int count = 0;
				for (int i = 2; i < num; ++i) {
					if (num % i == 0) {
						
						count++;

					}
				}
                if(count==0) { 
                	System.out.println(num);
                }
                
			}

		}

	}


