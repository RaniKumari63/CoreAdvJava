package com.serialization1;

import java.io.Serializable;

public class Dog2 implements Serializable{

	static transient int i=10;
	final transient int j=20;
}
