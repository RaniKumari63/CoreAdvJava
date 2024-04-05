package com.inheritance1;

public class AnimalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark();
		d.eat();
		d.grow();
		BabyDog bd=new BabyDog();
		bd.bark();
		bd.eat();
		bd.grow();
		bd.sleep();
		Cat c=new Cat();
		c.bite();
		c.grow();

	}

}
