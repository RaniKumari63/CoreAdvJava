package fundamental;

public class OperatorEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte a=10;
byte b=20;
byte c=a+b;//possible loss of precision
System.out.println(c);
	}
//a+b=max(int,type of a,type of b)  ,max(int,byte,byte)=int
}
