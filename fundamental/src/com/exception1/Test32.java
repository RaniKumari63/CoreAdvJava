package com.exception1;

import java.io.IOException;

public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			
			Test32 t = new Test32();
			t.doNothing();
			System.out.println("I have done nothing");
			
		}catch(IOException e){
			System.out.println("Exception1");
		}
	}
	
	private void doNothing(){
		for(int i = 0 ; i < 10; i++){
		}

	}

}
