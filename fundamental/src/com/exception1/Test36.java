package com.exception1;

public class Test36 extends Exception{
	public static void main(String args[]) { 
	      try {
	         throw new Test36();
	      }
	      catch(Test36 t) {
	         System.out.println("Got the Test Exception");
	      }
	      finally {
	         System.out.println("Inside finally block ");
	      }
	  }
}