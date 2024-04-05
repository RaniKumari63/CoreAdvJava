package com.serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		

		Dog2 d1=new Dog2();
	
		System.out.println("Serialization started");
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		System.out.println("Serialization ended"+oos);
		
		
		
		
	//	------------------------------------
		
		System.out.println("Deserialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog2 d2=(Dog2)ois.readObject();
		
		System.out.println("deserialization ended");
		System.out.println(d2.i+"............."+d2.j);
	
		
	}

}
