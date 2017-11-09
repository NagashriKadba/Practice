package com.basics;

import java.util.regex.Pattern;

public class regularrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Study Java very well";
		String pattern=".*Java.*";
		Pattern mtc=Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		boolean mt1=Pattern.matches(pattern,str);
		System.out.println("\""+" Hi the word is repeating that many no of times "+"\" :"+mtc+"\""+mt1);
		
	}

}
