package fundamental;

public class LanguageFundamental7 {

	public static void main(String[] args) {
		
		int i = 10, j = 5;
		System.out.println(compute(i, j));
	}
	
	public int compute(int i, int j){
		if(j == 0)
			return 0;
		else
			return i / j;
	}
}