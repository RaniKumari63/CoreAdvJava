package fundamental;

public class InstanceEx0 {

	int x=10;
	int x1;
	double d;
	boolean b;
	String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(x);//non-static variable cannot referenced from a static context
		InstanceEx0 i=new InstanceEx0();
		System.out.println(i.x);
		System.out.println(i.x1);
		System.out.println(i.d);
		System.out.println(i.b);
		System.out.println(i.s);
		
		i.m1();
	}
	
	public void m1()
	{
		System.out.println(x);
		
	}

}
