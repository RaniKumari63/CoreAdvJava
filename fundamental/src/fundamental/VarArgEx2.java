package fundamental;

public class VarArgEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static void m1(int... x)
{
	System.out.println("var-arg");
}
public static void m1(int[] x)
{
	System.out.println("int[]");
}
}
