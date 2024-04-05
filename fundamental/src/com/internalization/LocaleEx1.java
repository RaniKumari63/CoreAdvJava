package com.internalization;

import java.util.Locale;

public class LocaleEx1 {
	public static void main(String[] args)
	{Locale l1=Locale.getDefault();
	System.out.println(l1.getCountry()+"\t"+l1.getLanguage());	
	System.out.println(l1.getDisplayCountry()+"\t"+l1.getDisplayLanguage());
	String[] s3=Locale.getISOLanguages();
	for(String s4:s3)
	{
	//System.out.print("ISO language is :");
	System.out.println(s4);
	}
	String[] s4=Locale.getISOCountries();
	for(String s5:s4)
	{
	System.out.print("ISO Country is:");
	System.out.println(s5);
	}

	}

}
