package fundamental;

public class StaticEx4 {
static int i=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("directly:"+i);
	funx();
	
	System.out.println("using class name "+StaticEx4.i);
	StaticEx4.funx();

	StaticEx4 ex=new StaticEx4();
	System.out.println("using object reference "+ex.i);
	ex.funx();
	StaticEx4 ex1=null;
	System.out.println("using reference variable"+ex1.i);
	ex1.funx();
	}
	static void funx()
	{
		System.out.println("Static method funx");
	}

}
