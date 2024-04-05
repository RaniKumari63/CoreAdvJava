package com.serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		

		Dog d1=new Dog();
		Cat c1=new Cat();
		Rat r1=new 	Rat();
		System.out.println("Serialization started");
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		System.out.println("Serialization ended"+oos);
		
		
		
		
	//	------------------------------------
		
		System.out.println("Deserialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		
		if(o instanceof Dog)
		{
		Dog d2=(Dog)o;	
		System.out.println(d2.i+"......hhh......."+d2.j);
		}
		else if(o instanceof Cat)
		{
			Cat c2=(Cat)o;
			System.out.println(c2.i+"....jjjj........"+c2.j);
		}
		else
		{
			Rat r2=(Rat)o;
			System.out.println(r2.i+"....kkkk......."+r2.j);
		}
		
		
		System.out.println("deserialization ended");
	}

}
