package com.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String content="NN AA BBB AAA CCC";
		String match="AA";
		Pattern m1=Pattern.compile(match,Pattern.CASE_INSENSITIVE);
		Matcher m2=m1.matcher(content);
		while(m2.find())
		{
			System.out.println("The pattern is found at "+m2.start()+" The pattern ends at postion "+m2.end());
		}
	}

}
