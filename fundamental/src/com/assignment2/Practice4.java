package com.assignment2;

import java.util.Scanner;

public class Practice4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice4 p=new Practice4();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Runs");
		int reqruns=sc.nextInt();
		System.out.println("Enter Overs");
		float overs=sc.nextFloat();
		System.out.println(p.getDisplayDetails(reqruns,overs));
	}
	
	String getDisplayDetails(int runs,float Overs)
	{ int  balls=0;
		String  str=Float.toString(Overs);
		if(Overs<10.0){
			
			
			balls=(Integer.parseInt(str.substring(0,1))*6)+Integer.parseInt(str.substring(2));
			
		
	 
		}
		else
		{
			 balls=(Integer.parseInt(str.substring(0,2))*6)+Integer.parseInt(str.substring(3));
		
			
		}
		float runrate=runs/Overs;
		float runrate1=runs/balls;
		
			
		if(runs<100||balls<100)
		{
			System.out.println(runs+"runs in "+balls+" @ "+runrate1+" per ball");
		}
		else
		{
			System.out.println(runs+"runs in "+Overs+" @ "+runrate+" per over");
		}
		return " ";
	}

}
