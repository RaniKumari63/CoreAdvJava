package fundamental;

public class SwapTWOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno=100;//fno=400
		int sno=200;//sno=100
		int eno=300;//eno=200
		int gno=400;//gno=300
		int temp=0;
		System.out.println("before swaping");
		System.out.println(fno+"\t"+sno+"\t"+eno+"\t"+gno);
		
		fno=fno+sno+eno+gno;//1000
		sno=fno-sno-eno-gno;//100
		
		eno=fno-sno-eno-gno;//200
		gno=fno-sno-eno-gno;//300
		fno=fno-sno-eno-gno;//
		System.out.println(fno+"\t"+sno+"\t"+eno+"\t"+gno);
	}

}
