package com.java45features;

public class Test4 {
public enum Directions{NORTH,SOUTH,WEST,EAST}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Directions d:Directions.values())
		{
			System.out.println(d);
		}
		
		System.out.println(Directions.valueOf("NORTH").ordinal());
		System.out.println(Directions.valueOf("SOUTH").ordinal());
		System.out.println(Directions.valueOf("WEST").ordinal());
		System.out.println(Directions.valueOf("EAST").ordinal());
	}

}
