package com.exception1;

public class Test31 extends Exception{	
String className;
	
	public static void main(String[] args){
		
		
		try{
			
			Test31 t = new Test31();
			if(t.className.equals("Test31"))
				System.out.print("Test ");
			else
				System.out.print("Other ");
			
		}catch(Exception e){
			System.out.print("Exception ");
		}catch(NullPointerException ne){
			System.out.print("Null ");
		}
		
	}
	
}
	