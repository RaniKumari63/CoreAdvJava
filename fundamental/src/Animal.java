
public class Animal {
int i=30;
static int j=90;
	void eat()
	{
		System.out.println("eat");
	}
	void sounds()
	{
		System.out.println("bark");
	}
	void print()
	{
		System.out.println(i);
	}
	void add(int i,int j)
	{// this(10,20,30);
		this.i=i;
		this.j=j;
		System.out.println(this.i);
		System.out.println(this.j);
	}
	static void sub(int i,int j)
	{
		
		//this.i=i;
		//this.j=j;
		
	}
	{
		System.out.println("bye");
	}
	Animal(int i,int j,int k)
	{
		System.out.println("hello");
	}
	Animal(int i,int j)
	{
		this(10,20,30);
		System.out.println("hai");
		
	}
	Animal()
	{
		this(10,30);
		
	}
}
