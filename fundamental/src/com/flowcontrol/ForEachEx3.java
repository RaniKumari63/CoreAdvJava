package com.flowcontrol;

public class ForEachEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5};
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
for(int x:a)
{
	System.out.println(x);
}
	}

}
