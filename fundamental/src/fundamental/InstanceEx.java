package fundamental;

public class InstanceEx {

	
	int sno;
	String sname;
	double sflee;
	boolean flag1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstanceEx  in=new InstanceEx();
System.out.println("sno\t"+in.sno+"sname\t"+in.sname+"sflee\t"+in.sflee+"flag\t"+in.flag1);
in.sno=100;
in.sname="rani";
in.flag1=true;
in.sflee=3.6;

		System.out.println("sno\t"+in.sno+"sname\t"+in.sname+"sflee\t"+in.sflee+"flag\t"+in.flag1);
	}

}
