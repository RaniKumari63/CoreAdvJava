package com.assignment2;

import java.util.Scanner;

public class Practice9 {
	boolean val;
			boolean isMajor(int gender,int age)
			{ 
				
			     if(gender==1)
			     {if(age>=21)
			    	val=true;
			     else 
			    	  val=false;
			     }
			     else if(gender==2)
			     {
			    	 if(age>=18)
					    	val=true;
					     else 
					    	  val=false;
			    	 
			     }

			return val;	
			}


			   public static void main(String[] args) {
			        // TODO Auto-generated method stub
				   Practice9 p=new Practice9();
				   Scanner sc=new Scanner(System.in);
				   System.out.println("enter gender");
				   
				   int gender=sc.nextInt();
                  System.out.println("enter age");
				   
				   int age=sc.nextInt();
				boolean value=p.isMajor(gender,age);
				System.out.println(value);
			   }



			}




