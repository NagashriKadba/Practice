package com.basics;

import java.util.regex.Pattern;

public class reggggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="NagaIsgoingtoeatandishappyandisgoingtosing";
		String mtc="is";
		Pattern p1=Pattern.compile(mtc,Pattern.CASE_INSENSITIVE);
		String strnew[]=p1.split(s1);
		for(String s2: strnew)
		{
			System.out.println(s2);
		}
		
		System.out.println("No of split strings is "+strnew.length);
	}

}
