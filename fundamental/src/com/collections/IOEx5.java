package com.collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOEx5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int count=0;
		
FileReader f=new FileReader("C:\\Driver1\\JavaPDF\\cricket123\\cricket.txt");	
		
BufferedReader br=new BufferedReader(f);

String line=br.readLine();
while(line!=null)
{
	System.out.println(line);
	line=br.readLine();
}
br.close();
}

}
