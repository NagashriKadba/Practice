package com.basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class firstreapeatedandnonrepeated {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	
		String s1="nagashrikadbaisawesome";
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		char arr[]=s1.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(h1.containsKey(arr[i]))
			{
				h1.put(arr[i],h1.get(arr[i])+1);
			}
			else
			{
				h1.put(arr[i], 1);
			}
			
		}
		
		System.out.println(h1);
		
		Set<Character> s2=h1.keySet();
		for(Character abc:s2)
		{
			if(h1.get(abc)>1)
			{
				System.out.println(abc+"-------->"+h1.get(abc));
				break;
			}
						
		}
		Set<Character> s3=h1.keySet();
		for(Character abc:s3)
		{
			if(h1.get(abc)==1)
			{
				System.out.println(abc+"-------->"+h1.get(abc));
				break;
			}
	
	}
		
	}

}
