package fundamental;

public class LanguageFundamental1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = Double.NaN;		
		double d2 = d1;
		
		if(d1 == d2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		char ch=' ';
		int k=ch;
		int i = 10;
		int j = 25;
		System.out.println(k+i+j);
		int i1 = 10;
		int j1 = 12;
		i1+=++j1;
		System.out.println(i1);
		int i2 = 010;
		System.out.println(i2);
//		byte b1 = 5, b2 = 2;
//		byte b = b1 % b2;
//		System.out.println(b);
		
//		boolean b1 = true;
//		boolean b2 = true;
//
//		if(b1 == b2){
//			System.out.print("==");
//		}
//
//		if(b1.equals(b2)){
//			System.out.print("equals");
//		}
//		
//		int array[] = new int[1];
//		array[0] = 100;
//
//		System.out.println(array.length());	
		
//		float f = 10.2;
//		double d = 10.2;
//		
//		if(f == d)
//			System.out.println("Same");
//		else
//			System.out.println("Not same");	
		
		int i4= 5, j4 = 2;
		System.out.println( i4 % j4);

	}

}
