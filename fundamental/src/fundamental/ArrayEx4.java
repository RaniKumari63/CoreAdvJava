package fundamental;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ar[]=new String[3];
Scanner sc=new Scanner(System.in);
for(int i=0;i<ar.length;i++)
{
	System.out.println("enter the faculity name");
	String  fn=sc.next();
	ar[i]=fn;
	System.out.println("enter faculity id");
	int id=sc.nextInt();
	ar[i]=Integer.toString(id);
	System.out.println("enter faculity address");
	String ad=sc.next();
	ar[i]=ad;
}

System.out.println("display faculity elements");

for(String i:ar)
{
	System.out.println(i);
}
	}

}
