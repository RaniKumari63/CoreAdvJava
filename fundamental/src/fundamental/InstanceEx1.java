package fundamental;

public class InstanceEx1 {
int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceEx1 b=new InstanceEx1();
InstanceEx1 b1=new InstanceEx1();
b.i=900;
System.out.println(b.i+"\t"+b1.i);
System.out.println(b);
System.out.println(b1);
	}

}
