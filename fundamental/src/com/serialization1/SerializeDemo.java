package com.serialization1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee();
e.name="aaaaaaaaaaaa";
e.address="hhhhhhh";
e.SSN=11113333;
e.number=101;
try {
	
	FileOutputStream fileout=new FileOutputStream("C:\\Driver1\\JavaPDF\\employee.ser");
	ObjectOutputStream out=new ObjectOutputStream(fileout);
	out.writeObject(e);
	out.close();
	fileout.close();
	
}
catch(IOException i)
{
	i.printStackTrace();
}
	}

}
