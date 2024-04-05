package com.exception1;

public class Test30 extends Exception{	
	
public static void main(String[] args){
		
		try{
			
			Test30 t = new Test30();
			int d = t.getNum(2, 5);
			System.out.println(d);
			
		}catch(Exception e){
			System.out.print("Exception 1 ");
		}
	}
	
	public int getNum(int a, int b){
		
		int c = 0;
		try{
			
			c = a * b;
			if(c > 10)
				throw new String("Cannot be more than 10 ");
			
		}catch(Exception e){
			System.out.print("Exception 2 ");
		}
		
		return c;
	}
}
	