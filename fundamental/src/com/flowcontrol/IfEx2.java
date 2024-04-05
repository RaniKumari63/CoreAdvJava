package com.flowcontrol;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int marks=sc.nextInt();
String msg="";
/*
 * if(marks>=90)
 * 
 * msg="a+grade"; else if(marks<90&&marks>=80) msg="agrade"; else
 * if(marks<80&&marks>=70) msg="bgrade"; else if(marks<70&&marks>=60)
 * msg="cgrade"; else if(marks<60&&marks>=50) msg="dgrade"; else
 * if(marks<50&&marks>=35) msg="egrade"; else msg="try for sep!";
 * System.out.println(msg);
 */
		

//msg=(marks>=90)?"a+grade":((marks<90&&marks>=80)?"agrade":((marks<80&&marks>=70)?"bgrade":(((marks<70&&marks>=60)?"cgrade":(marks<60&&marks>=50))));
msg=(marks>=90)?"a+grade":((marks<90&&marks>=80)?"agrade":((marks<80&&marks>=70)?"bgrade":pass);
System.out.println(msg);
	}

}
