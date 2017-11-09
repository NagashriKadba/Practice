package com.basics;

import java.util.Arrays;

public class revewordsinastr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str="Naga is a very good girl and technically strong";
		String str1[]=str.split(" ");
		
		System.out.println(Arrays.asList(str1));
		  String reverseword=" ";
	  for(int i=0;i<str1.length;i++)
	  {
		  
		  String word=str1[i];
		  for(int j=word.length()-1;j>0;j--)
		  {
			  
			  reverseword=reverseword+word.charAt(j)+" ";
		  }
	  }
System.out.println(reverseword);*/

		String s="naga shree banglore";
		String revSentence="";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++){
			String word=str[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
			revWord=revWord+word.charAt(j);
			}
			System.out.println(revWord);revSentence=revSentence+revWord+" ";
			}System.out.println(s);
			System.out.println(revSentence);
	}

}
