package fundamental;

public class StudentStaticEx {

	String name;
	int rollno;
	static String cname;
	static int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		
		StudentStaticEx t=new StudentStaticEx();
		System.out.println(t.x);
		System.out.println(StudentStaticEx.x);
		System.out.println(x);
		System.out.println(cname);
	
		
	}
	
	public void m1()
	{
		System.out.println(x);
	}

}
