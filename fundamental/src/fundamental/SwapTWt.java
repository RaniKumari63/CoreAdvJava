package fundamental;

public class SwapTWt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno=100;
		int sno=200;
		int eno=300;
		int  gno=400;
		int temp=0;
		System.out.println("before swaping");
		System.out.println(fno+"\t"+sno+"\t"+eno+"\t"+gno);
		temp=fno;
		fno=sno;
		sno=eno;
	
		eno=gno;
		gno=temp;
		System.out.println(fno+"\t"+sno+"\t"+eno+"\t"+gno);
	}

}
