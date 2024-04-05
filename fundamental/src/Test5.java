
public class Test5 {

	int add(int i)
	{
		return (1+i);
	}
	int add(int i,int j)
	{
	return i+j;	
	}
	int add(String i,String j)
	{
		return 2;
	}
static	int add(Float f,int i)
	{
		return 3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test5 t5=new Test5();
t5.add(6);
t5.add(3,4);
add(22.5f,4);

	}

}
