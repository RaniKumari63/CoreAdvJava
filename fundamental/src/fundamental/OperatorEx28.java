package fundamental;

public class OperatorEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread();
System.out.println(t instanceof Thread);
System.out.println(t instanceof Object);
System.out.println(t instanceof Runnable);
String s=new String("bhaskar");
//System.out.println(s instanceof Thread);
Object o=new Object();
System.out.println(o instanceof String);
Object o1=new String("ashok");
System.out.println(o1 instanceof String);

		
	}

}
