package fundamental;

public class StaticEx {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//static variables
	//the variable is not changed from object to object then we declare variable has static variable	
	//static variable must declare at class level not within blocks,constructors,and methods
		//static variable are created  at the time of class loading and destroyed at time of class unloading
		//scope of static variable is scope .class file
		//class is loading  
		
		//java test
		//1  start jvm
		//2 create and start main thread
		//3 locate test.class file
		//4 load test.class(static variables is created)
		//5 execute main() method
		//6 unload test class(static variable is destroyed)
		//7 terminate main thread
		//8 shut down jvm
		
		//static variable is stored in method area
	//static variable can be accessed by using class name and or using object
	//static can be accessed in instance area and static area
		//for static variables jvm will provide default values
		//static variable are accessed by multiple threads at a time so it is not thread safe
	}

}
