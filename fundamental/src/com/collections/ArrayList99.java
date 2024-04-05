package com.collections;

import java.util.*;  
class ArrayList99{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ajay");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ravi");  
  al2.add("Hanumat");  
  al.retainAll(al2);  
  System.out.println("iterating the elements after retaining the elements of al2");  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }
  System.out.println("Is ArrayList Empty: "+al.isEmpty());   
 
 
 
ArrayList<Book> list131=new ArrayList<Book>();  
 //Creating Books  
 Book b11=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
 Book b22=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
 Book b33=new Book(103,"Operating System","Galvin","Wiley",6);  

 
 list131.add(b11);  
 list131.add(b22);  
 list131.add(b33);  
 //Traversing list  
 for(Book b:list131){  
     System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
 } 
 Iterator itr3=list131.iterator();
 while(itr3.hasNext())
 {
	 System.out.println("bid"+itr3.next().getClass());
	 
 }
 ArrayList<Integer> al55 = new ArrayList<Integer>();  
 
 System.out.println("The size of the array is: " + al55.size()); 
 
 
 ArrayList<Integer> al66 = new ArrayList<Integer>(10);  
 
 System.out.println("The size of the array is: " + al66.size());  
 }
}  