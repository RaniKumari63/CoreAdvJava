package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class test3
{
    public int findMax(int[]arr)
    {
        int max=0;
        int count=0;
        if(arr!=null)
        {



       for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                count++;
                
            }
            if(count==3)
            {
                max=-1;
            }
    
            if(arr[i]>max)
            {
                max=arr[i];
            }
            }
        }
        else
        max=0;



       return max;
    }    
    
    public int[] getIncreaseDecrease()
    { int size=0;
          Scanner sc = new Scanner(System.in);
          int[] arr=null;//new int[size];
       if(arr!=null)
       {
    	   System.out.println("Enter the size of the array that is to be created:: ");
            size = sc.nextInt();
         
           System.out.println("Enter the elements of the array ::");
       
      for(int i=0; i<size; i++)
          {
             arr[i] = sc.nextInt();
          }
       }
          return arr;
        
       }



      public static void main(String args[])
       {
          test3 obj = new test3();
          int arr[] = obj.getIncreaseDecrease();
          System.out.println("Array created is :: "+Arrays.toString(arr));
          System.out.println("Maximum value in the array is::"+obj.findMax(arr));
       }
    }
