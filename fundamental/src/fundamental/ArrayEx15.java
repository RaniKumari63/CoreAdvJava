package fundamental;

import java.util.Scanner;

public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[][]=new int[4][4];
		for(int k=0;k<4;++k)
		{ 
			 for(int l=0;l<4;l++)
			 { 
				 System.out.println("Enter elements");
				Scanner sc=new Scanner(System.in);
				 int num=sc.nextInt();
				 ar1[k][l]=num;
			 }
		
			 
		}
			System.out.println("Display array Elements");
			int total=0;
		for(int m=0;m<4;++m)
		{ 

			 for(int n=0;n<4;n++)
			 { 
				if(m==n) {
				
				total += ar1[m][n];
				}
				System.out.print(ar1[m][n]);
				
			 }
			 System.out.println();
			
		}
		System.out.println(total);
		
	}

}
