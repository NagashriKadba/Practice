package com.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestSubstringOfString {

	public static void main(String args[])
	{
	
		String s1="Naga had a little Golden Retriever";
		String arr[]=s1.split(" ");
		String longest="";
		int maxlen=0;
		for(int i=0;i<arr.length;i++)
		{
			
			//System.out.println(arr[i]);
			if(arr[i].length()>maxlen)
			{
				maxlen=arr[i].length();
				longest=arr[i];
				
			}
			
			
		}
		System.out.println(longest);
		
	}

}

	
	