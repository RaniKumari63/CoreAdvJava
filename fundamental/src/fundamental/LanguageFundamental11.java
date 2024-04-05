package fundamental;

public class LanguageFundamental11 {

	public static void main(String[] args) {
		
		byte b1 = 10, b2 = 5;
		compute(b1, b2);
	}
	
	public static void compute(long l1, long l2){
		System.out.println("long");
	}
	static native void compute(int i, int j){
		System.out.println("int");
	}
}