package com.assignment2;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
    {
      String s=null;
         int n;
          
            System.out.println("Enter how may fibonnaci numbers to print");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
           if(n<=0)
           {
        	   System.out.println(s);
        	   
           }
           else
           {
            for (int i = 0; ((i<=n-1)&&(i<12)); ++i)
            { 

            if(i==0)
            	System.out.print((getFibonacciSeries(i)));
            else
            	System.out.print(","+(getFibonacciSeries(i)));
           
            
            }
           }
    }
     
	 public static String getFibonacciSeries(int n)
     { String val="";
        int value1=0;
        
         if(n==0)
         { val=Integer.toString(0);
             return val;
         }
         else if(n==1) {
        	 val=Integer.toString(1);
             return val;

         }
         else
         {  value1=Integer.parseInt(getFibonacciSeries(n-1))+Integer.parseInt(getFibonacciSeries(n-2));
      
        	
        			val=Integer.toString(value1);
        	 
         
            
         }
         
         return val;
          
     }
}
