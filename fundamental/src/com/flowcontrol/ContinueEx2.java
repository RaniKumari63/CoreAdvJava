package com.flowcontrol;

public class ContinueEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{ 
			if(i==5)
		{ System.out.println("inside loop ,before continue");
			continue;
			System.out.println("outside loop,after continue");
		}
			System.out.println("after loop");
		}

	}

}
