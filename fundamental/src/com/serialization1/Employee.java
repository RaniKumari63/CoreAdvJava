package com.serialization1;

import java.io.Serializable;

public class Employee implements Serializable {
public String name;
public String address;
public transient int SSN;
public int number;
public void mailCheck()
{
	System.out.println("name"+name+"address"+address);
}
}
