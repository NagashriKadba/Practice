package com.basics;

import java.util.Arrays;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		anagram("keEp", "peeK");
		anagram("SiLeNt CAT", "LisTen AcT");
		anagram("Debit Card", "Bad Credit");
		anagram("Credircart", "debitcards");
	}
	
	
	public static void anagram(String s1,String s2)
	{
		
		String copys1=s1.replaceAll("\\s", "" );
		String copys2=s2.replaceAll("\\s", "" );	
		if(copys1.length()!=copys2.length())
		{
			System.out.println("not an anagram");
			
		}
		else
		{
		char arr[]=copys1.toLowerCase().toCharArray();
		char arr1[]=copys2.toLowerCase().toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		boolean status = Arrays.equals(arr,arr1);
		if(status)
		{
			System.out.println("s1 and s2 are anagram");
		}
		else
		{
			System.out.println("s1 and s2 are not anagrams");
		}
		
	}
	}

}
