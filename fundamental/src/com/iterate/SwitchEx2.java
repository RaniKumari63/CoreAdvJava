package com.iterate;

import java.util.Scanner;

public class SwitchEx2 {
	
	int fno=100;
	int sno=200;
	int result;
	 void add() {
		 result=fno+sno;
		 System.out.println("Addition of two Numbers:"+result);
	 }
	 void sub() {
		 result=sno-fno;
		 System.out.println("Subtraction of two Numbers:"+result);
	 }
	 
	 void mul() {
		 result=fno*sno;
		 System.out.println("Multiplication of two Numbers:"+result);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
SwitchEx2  daoImpl=new SwitchEx2();
while(true)
{
		
		System.out.println("-------------------------");
		System.out.println("             1)ADD       ");
		System.out.println("             2)SUB      ");
		System.out.println("             3)MUL       ");
		System.out.println("             1)EXIT       ");
		System.out.println("-------------------------");
		System.out.println("enter choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			daoImpl.add();
			break;
		case 2:
			daoImpl.sub();
			break;
		case 3:
			daoImpl.mul();
			break;
		case 4:
			System.out.println("Thx for using App");
			System.exit(0);
			
	default:
		 System.out.println("Choose 1 to 4 between");
		
		
			
		}
		}
	}

}
