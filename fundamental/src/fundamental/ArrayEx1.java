package fundamental;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(new int[] {10,20,30,40}));
	}
	public static int sum(int[] a)
	{
		int total=0;
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
		}
		return total;
	}

}
