package com.flowcontrol;

public class BreakEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
				System.out.println("inside loop before break");
			break;	
			System.out.println("inside loop after break");
			}
			System.out.println("after loop");
		}
	}

}
