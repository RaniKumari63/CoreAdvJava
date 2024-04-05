package com.abstract1;

import java.util.Scanner;

public class StudentClient {
	static int fee;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student ID");
int id=sc.nextInt();
System.out.println("Enter Student name");
String sname=sc.next();
System.out.println("Enter Student mobile");
long mobileno=sc.nextLong();
System.out.println("Enter Student Address");
String sadd=sc.next();
System.out.println("Enter Student Course");
String course=sc.next();
System.out.println("----------------------------------------");
System.out.println("----------1)FastTrack--------------------");
System.out.println("----------2)CorporateBatch---------------");
System.out.println("----------3)WeekendBatch----------------");
System.out.println("-----------4)CorporateWeekendBatch-------");
System.out.println("------------5)exit---------------------");
System.out.println("Enter the option");
int option=sc.nextInt();
switch(option)
{
case 1: 
FastTrackBatch ft=new FastTrackBatch(id,sname,mobileno,sadd,course);
 fee=ft.calculateFee(course);
	System.out.println(ft.getStudentid()+"\t"+ft.getName()+"\t"+ft.getMobileNo()+"\t"+ft.getAddress()+"\t"+ft.getCourse()+"\t"+fee);
	break;
	

case 2:
	CorporateBatch cp=new CorporateBatch(id,sname,mobileno,sadd,course);
	fee=cp.calculateFee(course);
		System.out.println(cp.getStudentid()+"\t"+cp.getName()+"\t"+cp.getMobileNo()+"\t"+cp.getAddress()+"\t"+cp.getCourse()+"\t"+fee);
		break;
case 3:
	WeekendBatch wb=new WeekendBatch(id,sname,mobileno,sadd,course);
	 fee=wb.calculateFee(course);
		System.out.println(wb.getStudentid()+"\t"+wb.getName()+"\t"+wb.getMobileNo()+"\t"+wb.getAddress()+"\t"+wb.getCourse()+"\t"+fee);
		break;
case 4:
	CorporateWeekendBatch cwb=new CorporateWeekendBatch(id,sname,mobileno,sadd,course);
	 fee=cwb.calculateFee(course);
		System.out.println(cwb.getStudentid()+"\t"+cwb.getName()+"\t"+cwb.getMobileNo()+"\t"+cwb.getAddress()+"\t"+cwb.getCourse()+"\t"+fee);
		break;
case 5: System.exit(0);
default:System.out.println("thanks");
	}
}
}