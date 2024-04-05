package com.collections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int count=0;
		File f=new File("C:\\Driver1\\JavaPDF\\cricket.txt");
		System.out.println(f.exists());
		f.createNewFile();
	
		System.out.println(f.exists());
		File f1=new File("C:\\Driver1\\JavaPDF\\cricket123");
		f1.mkdirs();
		File f2=new File("C:\\Driver1\\JavaPDF\\cricket123","cricket.txt");
		String[] s=f1.list();
		for(String s1:s) {
		count++;
		System.out.println(s1);
		 }
		
FileWriter fw=new FileWriter("C:\\\\Driver1\\JavaPDF\\cricket123\\cricket.txt");
fw.write(99);
fw.write("haran\nsoftware solutions");
fw.write("\n");
char[] ch={'a','b','c'};
fw.write(ch);
fw.write("\n");
fw.flush();

System.out.println("total number : "+count);
		
	}

}
