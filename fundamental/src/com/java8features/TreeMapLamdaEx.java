package com.java8features;

import java.util.TreeMap;

public class TreeMapLamdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> m=new TreeMap<Integer,String>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
m.put(100,"aaaa");
m.put(200,"bbbb");
m.put(300,"cccc");
m.put(400,"dddd");
m.put(500,"eeee");
m.put(600,"ffff");
m.put(700,"gggg");
m.put(800,"hhhh");
m.put(900,"iiii");
m.put(1000,"jjjj");
m.put(1100,"kkk");m.put(2200,"llll");
System.out.println(m);
	}

}
