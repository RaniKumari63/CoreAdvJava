package com.exception1;

public class Test29 extends Exception{	
	
	private String message;
	
	public Test29(String message){
		this.message = message;
	}
	
	public static void main(String[] args){
		
		int a = 5, b = 3;
		try{
			
			if( a % b > 0 )
				throw new Test29();
			
		}catch(Exception e){
			System.out.println("Test Exception");
		}
	}
}
	