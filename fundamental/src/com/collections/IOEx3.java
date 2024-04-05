package com.collections;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int count=0;
		
File f=new File("C:\\Driver1\\JavaPDF\\cricket123\\cricket.txt");	
		
FileReader fr=new FileReader("C:\\Driver1\\JavaPDF\\cricket123\\cricket.txt");

char[] ch=new char[(int)f.length()];
fr.read(ch);
for(char ch1:ch)
{
	System.out.println(ch1);
}
}

}
