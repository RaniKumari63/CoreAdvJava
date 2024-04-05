package com.exception1;

import java.io.IOException;

public class Test33 extends Exception{	
	
	public Test33(){}
	public Test33(String str){
		super(str);
	}
	
	int importantData = 5;
	public static void main(String[] args){
		Test33 t = new Test33();
		t.importantMethod();
	}
	
	private void importantMethod(){
		if( importantData > 5)
			throw new Test33("Important data is invalid");
		else
			System.out.println(importantData);
	}
	
}