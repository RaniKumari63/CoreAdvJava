package com.abstractassignment;

import java.util.Scanner;

public class MoonRefrigrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mr=new Scanner(System.in);
		System.out.println("Welcome to Moon Refrigrators");
		Mprocess mrf = new Refrigrator();
		Wiring mm = new Wiring();
		mm.setWiringType("Hidden");
		System.out.println(mm.getWiringType());
		mrf.door();
		mrf.colour();
		mrf.size();
		mrf.temperature();
		Mprocess mro = new Oven();
		
		mm.setWiringType("Hidden");
		System.out.println(mm.getWiringType());
		mro.door();
		mro.colour();
		mro.size();
		mro.temperature();
	}

}
