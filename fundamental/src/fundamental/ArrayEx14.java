package fundamental;

import java.util.Scanner;

public class ArrayEx14 {
 public static void main(String[] args) {
	int ar[][]=new int[3][4];
	for(int i=0;i<3;++i)
	{ 
		 for(int j=0;j<4;j++)
		 {
			 System.out.print(ar[i][j]+" ");
		 }
	
		 System.out.println();
	}
 
 
 
 int ar1[][]=new int[3][3];
	for(int k=0;k<3;++k)
	{ 
		 for(int l=0;l<3;l++)
		 { 
			 System.out.println("Enter elements");
			Scanner sc=new Scanner(System.in);
			 int num=sc.nextInt();
			 ar1[k][l]=num;
		 }
	
		 
	}
		System.out.println("Display array Elements");
	for(int m=0;m<3;++m)
	{ int total=0;

		 for(int n=0;n<3;n++)
		 { 
			
			System.out.print(ar1[m][n]);
			total += ar1[m][n];
			
		 }
	System.out.println(total);
		
	}
	
	
	int array1[][]=new int[3][];
	array1[0]=new int[3];
	array1[1]=new int[2];
	array1[2]=new int[1];
	
	for(int i=0;i<array1.length;++i)
	{ for(int j=0;j<array1[i].length;++j)
	{
		System.out.print(array1[i][j]);
	}
		System.out.println();
	}
	
	
	int ar3[][]=new int[3][];
	ar3[0]=new int[3];
	ar3[1]=new int[2];
	ar3[2]=new int[1];
	for(int v=0;v<ar3.length;++v)
	{ 
		 for(int x1=0;x1<ar3[v].length;x1++)
		 { 
			 System.out.println("Enter elements");
			Scanner sc=new Scanner(System.in);
			 int num=sc.nextInt();
			 ar3[v][x1]=num;
		 }
	
		 
	}
		System.out.println("Display array Elements");
	for(int m=0;m<ar3.length;++m)
	{ int total=0;

		 for(int n=0;n<ar3[m].length;n++)
		 { 
			
			System.out.print(ar3[m][n]);
			total += ar3[m][n];
			
		 }
	System.out.println(total);
		
	}
	
}
 
}
