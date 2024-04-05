package fundamental;

public class VarArgEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgEx7 a=new VarArgEx7();
		a.add();
		a.add(10);
		a.add(10,20);
		a.add(10,20,30);
	
	}
public  void add(int... a)
{
	System.out.println("No of arguments:"+a.length);
	int result=0;
	System.out.println("Argument list");
	for(int i=0;i<a.length;i++)
	{System.out.println(a[i]+" ");
	result=result+a[i];
		
	}
	System.out.println();
	System.out.println("Addition:"+result);
}
public void m1(int...i,float f)
{
	
}
void m2(int ...i,float ...f)
{
	
}

}