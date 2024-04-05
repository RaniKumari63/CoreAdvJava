package com.lang2;

public class EqualsEx {
	EqualsEx(int i,int j)
	{
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=100;
int j=200;
int k=100;
//System.out.println(i==j);
//System.out.println(i==k);

String s=new String("rani");
String s1=new String("rani");
String str="rani";
String str1="rani";
System.out.println(s==s1);
System.out.println(s.equals(s1));

System.out.println(str==str1);
System.out.println(str.equals(str1));
EqualsEx e=new EqualsEx(100,200);
EqualsEx e1=new EqualsEx(200,300);
System.out.println("hai"+(e==e1));
System.out.println("hai"+(e.equals(e1)));

System.out.println("ssssfsfdgjfgdkfdksfs".length());
System.out.println("            Welcome to java          ");
System.out.println("            Welcome to java          ".trim());
System.out.println("kdfjsdklfjksdl".replace('k', 'z'));
System.out.println("welcome to shive online".replaceAll("welcome", "hai"));
System.out.println("Welcome to Shiva Online Training Welcome".replaceAll("Welcome","Java"));


System.out.println("Welcome to Shiva Online Training Welcome".replaceFirst("Welcome","Java"));




System.out.println("sivasanakrareddi".substring(4));//sanakrareddi

System.out.println("sivasanakrareddi".substring(4,12));//sanakrar

System.out.println("siva".charAt(2));


	}
	}


