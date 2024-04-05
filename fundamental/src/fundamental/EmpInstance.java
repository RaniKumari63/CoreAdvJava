package fundamental;

public class EmpInstance {
	int eno;
	String ename;
	String eadd;
	float sal;
	void EmpDetails()
	{
		eno=100;
		ename="rani";
		eadd="calgary";
		sal=23324;
		System.out.println(eno+"\t"+ename+"\t"+eadd+"\t"+sal+"\t");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpInstance emp=new EmpInstance();
emp.EmpDetails();
System.out.println(emp.eno+"\t"+emp.ename+"\t"+emp.eadd+"\t"+emp.sal+"\t");
	}

}
