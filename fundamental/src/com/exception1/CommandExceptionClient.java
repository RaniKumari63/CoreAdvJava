package com.exception1;

public class CommandExceptionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int count=0;
int num=0;
for(int i=0;i<args.length;i++)
{
	try
	{
		num=Integer.parseInt(args[i]);
		
	}catch(NumberFormatException e)
	{
		count++;
		System.out.println("The error is Invalid number");
	}
	sum=sum+num;
}
	 
	 System.out.println("The sum of the arguments passed is " + sum);
	 System.out.println("the sum of invalid numbers is "+count);

	}

}
