package com.iterate;

public class WhileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		int i=0;
		int count=0;
while(i<1000)
{
	if((i%2==0)&&(i%3==0)&&(i%5==0))
	{
		System.out.print(i+"\t");
		count++;
	}
	if(count==5)
		break;
		
	i++;
}
	}

}
