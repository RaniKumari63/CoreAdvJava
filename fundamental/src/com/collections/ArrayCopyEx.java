package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] copyfrom={10,20,30,40,50,60,70,80};
		int[] copyto = new int[7];
		System.arraycopy(copyfrom,1,copyto,0,7);
		for (int cc:copyto)
		{ System.out.println(cc);
		}
		int[] copyfrom1={10,20,30,40,50,60,70,80};
		int[] newarray=java.util.Arrays.copyOfRange(copyfrom,1,4);
		for (int aa:newarray)
		{ System.out.println(aa);//20 30 40
		}
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		a1.add("Sravya");
		a1.add("yadhu");
		ArrayList<String> a2 = new ArrayList<String>(a1.subList(1,3));
		System.out.println(a2); //[anu,Sravya]
		System.out.println("before swapping="+a1);//[ratan, anu, Sravya, yadhu]
		Collections.swap(a1,1,3);
		System.out.println("after swapping="+a1);// [ratan, yadhu, Sravya, anu]
	
	
		String[] str={"ratan","Sravya","aruna"};
		ArrayList<String> a11 = new ArrayList<String>(Arrays.asList(str));
		a11.add("ratan");
		a11.add("anu");
		for (String s: a11)
		{ System.out.println(s);
		}
		
	}

}
