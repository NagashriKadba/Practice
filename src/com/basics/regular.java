package com.basics;

import java.util.regex.Pattern;

public class regular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String pattern="My name is Naga and i am not a terrorist";
		String match=".*Naga.*";
		boolean mtc=Pattern.matches(match,pattern);
		System.out.println("The word Naga is present in the string :"+mtc);
}
		
	}


