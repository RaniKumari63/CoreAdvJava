package fundamental;

public class OperatorEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(10/0);//AE
//System.out.println(10/0.0);//infinity
//System.out.println(-10/0.0);//-infinity
//System.out.println(0/0);//AE
//System.out.println(0.0/0);//NAN
//System.out.println(-0.0/0);NAN
System.out.println(10<Float.NaN);
System.out.println(10<=Float.NaN);
System.out.println(10>Float.NaN);
System.out.println(10<Float.NaN);
System.out.println(10>=Float.NaN);
System.out.println(10==Float.NaN);
System.out.println(Float.NaN==Float.NaN);
System.out.println(10!=Float.NaN);
System.out.println(Float.NaN!=Float.NaN);

	}

}
