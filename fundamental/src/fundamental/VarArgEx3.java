package fundamental;

public class VarArgEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
m1(10,20);
m1(10);
	}
public static void m1(int... x) {
	System.out.println("var-arg method");
}
public static void m1(int x)
{
	System.out.println("m1");
}
}
