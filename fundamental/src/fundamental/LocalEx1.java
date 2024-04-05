package fundamental;

public class LocalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int j=Integer.parseInt("ten");	
			
		}
		catch(NumberFormatException ex)
		{
			j=10;
		}
		System.out.println(j);
	}

}
