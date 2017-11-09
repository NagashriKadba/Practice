package com.basics;

import java.util.HashMap;
import java.util.Set;

public class morethanoneoccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		
		
		occurancestring("Naga  ");
	}
	
	public static void occurancestring(String str)
	{
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		System.out.println(h1.getClass());
		System.out.println(h1.getClass().getSimpleName());
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
			{
				if(h1.containsKey(arr[i]))
				{
					h1.put(arr[i],h1.get(arr[i])+1);
				}
				else
				{
					h1.put(arr[i],1);
				}
			}
		}
	//	System.out.println(h1);
		Set<Character> s1=h1.keySet();
		for(Character abc:s1)
		{
		if(h1.get(abc)>1)
		{
			System.out.println(abc+"---------->"+h1.get(abc));
		}
		
	}

}}
