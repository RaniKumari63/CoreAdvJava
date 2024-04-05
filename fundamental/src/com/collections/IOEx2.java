package com.collections;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int count=0;
		
	
		
FileReader f=new FileReader("C:\\Driver1\\JavaPDF\\cricket123\\cricket.txt");
int i=f.read();
while(i!=-1)
{
	
	System.out.println((char)i);
	i=f.read();
}
	}

}
