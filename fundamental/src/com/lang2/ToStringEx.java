package com.lang2;

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringEx t=new ToStringEx();
		System.out.println(t);
		System.out.println(t.hashCode());

		System.out.println(Integer.toHexString(t.hashCode()));
System.out.println(t.getClass());
System.out.println(t.getClass().getName());

	}
	public String ToStringEx() {
		// TODO Auto-generated constructor stub
		return "how r u";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}

}
