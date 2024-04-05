package fundamental;

public class InstanceEx2 {

	int i=1,j=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=10;
		InstanceEx2 e1=new InstanceEx2();
		k=k+1;
		e1.i=20;
		e1.j=30;
		System.out.println(e1.i);
		System.out.println(e1.j);
		InstanceEx2 e2=new InstanceEx2();
		System.out.println(e2.i);
		System.out.println(e2.j);
		System.out.println(e1.j);
	}

}
