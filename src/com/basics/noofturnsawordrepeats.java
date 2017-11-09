package com.basics;

import java.util.Arrays;

public class noofturnsawordrepeats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="da da da ta";
		String search="da";
		int index=0;
		int i=0;
		int count=0;
		
		while(s1.indexOf(search,i)!=-1)
		{
			count++;
			index=s1.indexOf(search, i);
			i=index+search.length();	
		}
		System.out.println(count);
	
	}
}
