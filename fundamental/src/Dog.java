
public class Dog  extends Animal{
int i=10;
	void eat() {
		System.out.println("fast eat");
	}
	void sleep()
	{
		System.out.println("sound sleep");
	}
	Dog()
	{
		this(10,20);
		System.out.println("hai");
	}
	Dog(int i,int j)
	{
		super(10,20);
	}
	
}
