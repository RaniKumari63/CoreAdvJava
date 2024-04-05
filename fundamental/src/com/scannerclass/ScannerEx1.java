package com.scannerclass;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("employee number");
int eno=s.nextInt();
System.out.println("employee name");
String ename=s.next();
System.out.println("employee salary");
float esal=s.nextFloat();
System.out.println("employee address");
String eaddr=s.next();
System.out.println("employee details");
System.out.println("---------------");
System.out.println("employee number"+eno);
System.out.println("employee name"+ename);
System.out.println("employee salary"+esal);
System.out.println("employee address"+eaddr);


	}

}
