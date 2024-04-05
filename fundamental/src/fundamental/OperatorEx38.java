package fundamental;

public class OperatorEx38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=10; a+=20; System.out.println(a);
		 */


		/*
		 * int a=30; a-=20; System.out.println(a);
		 */

		/*
		 * int a=30; a*=20; System.out.println(a);
		 */
		/*
		 * int a=30; a/=20; System.out.println(a);
		 */
		/*
		 * int a=30; a%=20; System.out.println(a);
		 */
		/*
		 * byte b=10; b=(byte)(b+1); //b=b++; System.out.println(b);
		 */
		
		
		/*
		 * byte b=10; b+=1;
		 */
		
		/*
		 * byte b=127; b+=3; System.out.println(b);
		 */
		
		int a,b,c,d;
		a=b=c=d=20;
		a+=b-=c*=d/=2;
		
		System.out.println(a+"---"+b+"----"+c+"---"+d);


	}

}
