package fundamental;

import java.util.Arrays;

public class Test59 {

    public static void main(String args[])
    {
    	int a[]= {8,6,9,3,7,5,1,110};
    	Arrays.sort(a);
    	System.out.println(Arrays.toString(a));
    	int b[]=new int[10];
    	System.arraycopy(a, 0, b, 0, 8);
    	System.out.println(Arrays.toString(b)); 
}
}


