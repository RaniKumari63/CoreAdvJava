package com.collections;
import java.util.*;  
public class ArrayListEx88 {


	
	  
		 public static void main(String args[]){  
		  //Creating user-defined class objects  
		  Student1 s1=new Student1(101,"Sonoo",23);  
		  Student1 s2=new Student1(102,"Ravi",21);  
		  Student1 s3=new Student1(103,"Hanumat",25);  
		  //creating arraylist  
		  ArrayList<Student1> al=new ArrayList<Student1>();  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student1 st=(Student1)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }  
		 
	}

}
class Student1{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student1(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  