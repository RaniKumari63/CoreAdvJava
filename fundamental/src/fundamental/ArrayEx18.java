package fundamental;

public class ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int [] numbers= {1,2,3,4,5,6};
	int [] positivesnum=numbers;
	numbers[0]=-1;
	for(int number:positivesnum)
	{
		System.out.print(" ,"+number);
	}
	
	}

}
