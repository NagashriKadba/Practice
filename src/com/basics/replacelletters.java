package com.basics;

import java.util.Arrays;

public class replacelletters {
	
	
	public static void replaceeee(String input)
	{
		char a[]=input.toCharArray();
		char ch='r';
		char rep='b';
		for(int i=0;i<a.length;i++)
		{
		if(a[i]==ch)
		{
			a[i]=rep;
		}
		}	
		System.out.println(Arrays.toString(a));
		String alpha="";
		for(int j=0;j<a.length;j++)
		{
			alpha=alpha+a[j];
		}
		System.out.println(alpha);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		replaceeee("ferrorcherr");
		
	}

}
