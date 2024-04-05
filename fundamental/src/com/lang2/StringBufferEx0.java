package com.lang2;

public class StringBufferEx0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.append("qr");
System.out.println(sb.capacity());
System.out.println(sb.length());
System.out.println(sb);
sb.insert(0, "rani");
System.out.println(sb);
sb.delete(0, 5);
System.out.println(sb);
System.out.println(sb.deleteCharAt(0));
System.out.println(sb.reverse());
sb.ensureCapacity(2000);
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.trimToSize();
System.out.println(sb.capacity());
StringBuffer sb1=new StringBuffer();
sb1.append("sjva");
System.out.println(sb1);
sb1.setCharAt(1,'i');
System.out.println(sb1);

StringBuffer sb2=new StringBuffer("rani");

	}

}
