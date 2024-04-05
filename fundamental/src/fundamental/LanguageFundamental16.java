package fundamental;

public class LanguageFundamental16 {

public static void main(String args[]){
	int i = 0, j = 1;
	boolean b = getValue(i, j) ? true : false;
	System.out.println(b);
}	

public static boolean getValue(int i, int j){
	return i > j;
}
	
}	
