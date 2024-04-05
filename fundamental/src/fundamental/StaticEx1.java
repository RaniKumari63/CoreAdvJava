package fundamental;

public class StaticEx1 {
static int x=10;
int y=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx1 ex1=new StaticEx1();
		ex1.x=888;
		ex1.y=999;
		StaticEx1 ex2=new StaticEx1();
		System.out.println(ex2.x+""+ex2.y);
		
	}

}
