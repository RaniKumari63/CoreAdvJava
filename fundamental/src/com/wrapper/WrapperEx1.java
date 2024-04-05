 package com.wrapper;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//valueof-----string to object
		  //value of----------primitive to object
		
		//xxxValue---intValue----------object,string to primitive
	//	parsexxx----String to primitive
		
	// tostring ---------object or primitive to string
Integer i=new Integer(10);
Integer i1=Integer.valueOf("0");
Boolean b=new Boolean(true);
 Boolean b1=true;
 Integer i3 = new Integer(10) ;
 Integer i4 = new Integer(10);
 System.out.println(i3); //10
 System.out.println(i3.equals(i4)); 

Integer i5=Integer.valueOf("10");
Double d=Double.valueOf("10.5");
Boolean b3=Boolean.valueOf("ashok");
Boolean b4=Boolean.valueOf("True");
System.out.println(i);//10
System.out.println(d);//10.5
System.out.println(b3);//false
System.out.println(b4);//f
Integer i6=Integer.valueOf("100", 2);
System.out.println(i6);
Integer i7=Integer.valueOf(10);
System.out.println(i7);
Double d1=Double.valueOf(10.5);
Boolean b8=Boolean.valueOf(true);
Character ch=Character.valueOf('a');
System.out.println(ch);
Integer i9=new Integer("130");
System.out.println(i9.byteValue());
System.out.println(i9.shortValue());
System.out.println(i9.intValue());
System.out.println(i9.longValue());
System.out.println(i9.floatValue());
System.out.println(i9.doubleValue());

int i88=Integer.parseInt("10");
boolean b88=Boolean.parseBoolean("ashok");
double d88=Double.parseDouble("10.5");
System.out.println(i88);//10
System.out.println(b88);//false
System.out.println(d88);//10.5
int i99=Integer.parseInt("100",2);
System.out.println(i99);//4
Integer i56=Integer.valueOf("10");
System.out.println(i56);//10
System.out.println(i56.toString());//
String s1=Integer.toString(10);
String s2=Boolean.toString(true);
String s3=Character.toString('a');
System.out.println(s1); //10
System.out.println(s2); //true
System.out.println(s3); //a
String s11=Integer.toBinaryString(7);
s11.concat("5");
String s22=Integer.toOctalString(10);
String s33=Integer.toHexString(20);
String s44=Integer.toHexString(10);
System.out.println(s11);//111
System.out.println(s22);//12
System.out.println(s33);//14
System.out.println(s44);//a

	}

}
