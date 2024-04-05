package fundamental;

public class LanguageFundamental12 {
public static void compute(int i,int j)
{
	System.out.println("int bbbversion");
}

public  void compute(int i,int j)
{
	System.out.println("long version");
}
public static void main(String args[]){
	LanguageFundamental12 t = new LanguageFundamental12();
	compute(10, 5);
}	
}