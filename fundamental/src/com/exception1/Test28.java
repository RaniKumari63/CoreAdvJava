package com.exception1;

public class Test28 extends Exception{	
	
	public static void main(String[] args){
		
		try{
			
			System.out.println("My Custom Exception test");
			throw new Test28();
			
		}catch(Exception e){
			System.out.println("Test Exception");
		}
	}
	
}