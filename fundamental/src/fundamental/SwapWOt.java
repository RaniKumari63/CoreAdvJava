package fundamental;

public class SwapWOt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno=100;
		int sno=200;
	
		System.out.println("before swaping");
		System.out.println(fno+"\t"+sno);
		fno=fno+sno;
		sno=fno-sno;
		fno=fno-sno;
		System.out.println(fno+"\t"+sno);

	}

}
