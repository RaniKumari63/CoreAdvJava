package fundamental;

import java.util.Arrays;

public class ArrayEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int [] source= {1,2,3,4,5,6};
	int[] destination1=Arrays.copyOfRange(source, 0, source.length);
	System.out.println(Arrays.toString(destination1));
	int[] destination2=Arrays.copyOfRange(source, 2, 5);
	System.out.println(Arrays.toString(destination2));
	
	}

}
