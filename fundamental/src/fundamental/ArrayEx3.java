package fundamental;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]=new int[3];
Scanner sc=new Scanner(System.in);
for(int i=0;i<ar.length;i++)
{
	System.out.println("enter the num");
	int num=sc.nextInt();
	ar[i]=num;
}

System.out.println("display array elements");

for(int i:ar)
{
	System.out.println(i);
}
	}

}
