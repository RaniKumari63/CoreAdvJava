package com.lang2;

public class StringBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("abcdefghijklmnop");
System.out.println(sb.capacity());
sb.append("q");
System.out.println(sb.capacity());
StringBuffer sb1=new StringBuffer(19);
System.out.println(sb1.capacity());
StringBuffer sb2=new StringBuffer("abcdefghijklllllllllllhj");
System.out.println(sb2.length());
System.out.println(sb2.capacity());
System.out.println(sb.charAt(14));//e
//System.out.println(sb.charAt(30));//RE : 
StringBuffer sb6=new StringBuffer("ashokkumar");
sb6.setCharAt(8,'A');
System.out.println(sb6);
StringBuffer sb7=new StringBuffer("abcdefgh");
 sb7.insert(2, "xyz");

 sb7.insert(11,"9");
 System.out.println(sb7);//abxyzcdefgh9

	}

}
