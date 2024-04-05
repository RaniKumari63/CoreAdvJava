package com.IOFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrinterWriterEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.print("true");
System.out.print("true");
System.out.println("true");
System.out.print("true"); 

FileWriter fw =new FileWriter("abc.txt");
PrintWriter out1=new PrintWriter(fw);
out1.write(100);
out1.println(100);
out1.println(true);
out1.println('c');
out1.println("durga");
out1.flush();
out1.close();



	}

}
