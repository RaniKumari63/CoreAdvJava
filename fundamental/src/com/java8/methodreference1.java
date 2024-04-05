package com.java8;

public class methodreference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reference to a 
Calculator cal=Scientific::findSum;
cal.calculate(10,20);
Calculator cal1=new Scientific()::findProduct;
	}

}
