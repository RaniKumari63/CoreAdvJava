package com.collections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOEx4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int count=0;
		
FileWriter f=new FileWriter("C:\\Driver1\\JavaPDF\\cricket123\\cricket.txt");	
		
BufferedWriter bw=new BufferedWriter(f);

bw.write(100);
bw.newLine();
char[] ch={'a','b','c','d'};
bw.write(ch);
bw.newLine();
bw.write("SaiCharan");
bw.newLine();
bw.write("software solutions");
bw.flush();
bw.close();

}

}
