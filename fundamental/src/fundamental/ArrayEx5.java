package fundamental;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {1,2,3,5,9,8,10};
int even[]=new int[ar.length];
int odd[]=new int[ar.length];
for(int i=0;i<ar.length;i++)
{
	if(ar[i]%2==0)
	{
		even[i]=ar[i];
	}
	else
	{
		odd[i]=ar[i];
	}
}
System.out.println("even numbers");
for(int j:even)
{
	if(j!=0)
	{
		System.out.println(j);
	}
}
for(int j:odd)
{
	if(j!=0)
	{System.out.println(j);
		
	}
}
	
	}

}
