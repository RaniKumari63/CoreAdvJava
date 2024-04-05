package fundamental;

public class LanguageFundamental2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o = new Two();
		o.sayHello();

	}

}
final class One{
	public void sayHello(){
		System.out.println("Parent Hello");
	}
}

class Two extends One{
	public void sayHello(){
		System.out.println("Child Hello");
	}	
}

