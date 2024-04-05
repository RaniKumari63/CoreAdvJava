package fundamental;

public class AccessSpecifiersEx {
  private int sno=10;
  
   protected void funA()
  {System.out.println("hello");
	  
  }
   public  AccessSpecifiersEx()
  {System.out.println("private constructor");
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessSpecifiersEx a=new AccessSpecifiersEx();
		a.funA();
	}

}
