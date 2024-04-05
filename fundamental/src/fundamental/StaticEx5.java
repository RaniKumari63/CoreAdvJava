package fundamental;

public class StaticEx5 {
static int x=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funx();
		System.out.println(x);
		funx();
		funx();
		System.out.println(x);
		StaticEx5 ex=new StaticEx5();
		System.out.println(ex.x);
		
	}
	static void funx()
	{
		x=x+1;
		x=x*1;
	}

}
