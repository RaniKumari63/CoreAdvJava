
public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Animal a=new Animal(); a.eat(); a.sounds(); //a.sleep(); a.print();
		 * a.add(20,30);
		 */


Dog d=new Dog();
d.eat();
d.sounds();
d.sleep();




Animal a1=new Dog();
a1.eat();
a1.sounds();

Cat c=new Cat();
c.eat();
c.sounds();

Animal a2=new Cat();
a2.eat();
a2.sounds();

/*
 * Dog d3=(Dog) new Animal(); d3.eat(); d3.sleep(); d3.sounds();
 */

BabyDog bd=new BabyDog();
bd.eat();
bd.sleep();
bd.sounds();

Dog d4=new BabyDog();
d4.eat();
d4.sleep();
d4.sounds();

Animal a5=new BabyDog();
a5.eat();
a5.sounds();

	}

}
