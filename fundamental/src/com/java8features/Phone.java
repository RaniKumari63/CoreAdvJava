package com.java8features;

public interface Phone {
void call();
default void message()
{
	System.out.println("sent");
}
}
