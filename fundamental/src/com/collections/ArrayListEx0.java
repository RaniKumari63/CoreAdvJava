package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
          list.add("Ravi");//Adding object in arraylist  
          list.add("Vijay");  
          list.add("Ravi");  
          list.add("Ajay");  
           
          ListIterator<String> litr=list.listIterator();  
          while(litr.hasNext())  
          {  
              String str=litr.next();  
              System.out.println(str);  
          }       System.out.println("Traversing list through List Iterator:");  
	
          ListIterator<String> list1=list.listIterator(list.size());  
          while(list1.hasPrevious())  
          {  
              String str=list1.previous();  
              System.out.println(str);  
          }  
	
          System.out.println("Traversing list through for loop:");  
          for(int i=0;i<list.size();i++)  
          {  
           System.out.println(list.get(i));     
          }  
	}

}
