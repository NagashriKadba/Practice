package com.basics;

import java.util.HashMap;

public class noofoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Wie heissst du?";
HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
char arr[]=s1.toCharArray();
for(int i=0;i<arr.length;i++)
{
	if(arr[i]!=' ')
	{
	
		if(h1.containsKey(arr[i]))
				
		{
			h1.put(arr[i], h1.get(arr[i])+1);
		}
		else
		{
			h1.put(arr[i], 1);
		}
	}
}
System.out.println(h1);
}
}
