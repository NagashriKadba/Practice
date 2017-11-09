package com.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="Naga is very hungry";
		String pattern=".*hungry.*";
		Pattern p1=Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher m2=p1.matcher(s1);
		boolean ismatched=m2.matches();
		System.out.println("The word has matched :"+ismatched);
	}

}
