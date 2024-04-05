package fundamental;

public class LanguageFundamental3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o = new Two();
		o.sayHello();
	}
	
}

class One{
	public final void sayHello(){
		System.out.println("Parent Hello");
	}
}

class Two extends One{
	public void sayHello(){
		System.out.println("Child Hello");
	}	
}

