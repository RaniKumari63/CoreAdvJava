package fundamental;

public class VarArgEx {
//m1(int... x)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30,40);
	}
public static void m1(int... x)
{
	//internal var-arg parameter is considered as i dimensional array
	System.out.println("m1"+x.length);
}


//m1(int... x) correct
//m1(int ...x) correcgt
//m1(int x...) correct
//m1(int. ..x) wrong
//m1(int .x..) wrong
//m1(int x,int... y) correct
//m1(String s,double... y) correct
//m1(double... d,String s) wrong
//m1(char ch,String... s) correct
//m1(int... x,double... d)wrong

//main(String[] args)==main(String... args)
//m1(int... x)=int[] x
//m1(String... x)==String[] x
//m1(int[]... x)==int[][] x
//m1(int[][]... x)==int[][][]x

}
