package fundamental;

public class OperatorEx42 {
	
	OperatorEx42()
	{
	System.out.println("no-arg constructor");	
	}
OperatorEx42(int i)
{
System.out.println(i);	
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
OperatorEx42 ex=new OperatorEx42(); 
System.out.println(ex);

Object o=Class.forName(args[0]).newInstance();
System.out.println(Class.forName(args[0]).isInstance(ex));
System.out.println(o);

	}

}
