package com.exception1;

class Test2
{
public static void main(String[] args){
try {
	System.out.println("statement1");
	System.out.println(10/0);
	System.out.println("statement3");
}
catch(Exception ex)
{
	System.out.println("statement4");
}
System.out.println("statement5");
}
}



