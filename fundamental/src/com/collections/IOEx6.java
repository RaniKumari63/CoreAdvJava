package com.collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class IOEx6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
FileWriter f=new FileWriter("C:\\Driver1\\JavaPDF\\cricket123\\cricket.txt");	
		
PrintWriter out=new PrintWriter(f);

out.write(100);
out.println(100);
out.println(true); 
out.println('c'); 
out.println("SaiCharan"); 
out.flush(); 
out.close();
}

}
