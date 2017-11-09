package com.basics;

public class Preservespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversestring("I am Naga");
		reversestring("I love eating ice cream");
	}
	
	
	public static  void reversestring(String input)
	{
		
		
		char[] ipstring=input.toCharArray();
		char rsstring[]=new char[ipstring.length];
		
		for(int i=0;i<ipstring.length;i++)
		{
			if(ipstring[i]== ' ')
			{
				rsstring[i]=' ';
			}
		}
	int j=rsstring.length-1;
	for(int i=0;i<ipstring.length;i++)
	{
		if(ipstring[i]!=' ')
		{
			if(rsstring[j]==' ')
			{
			j--;
			}
			rsstring[j]=ipstring[i];
			j--;
		}
	}	
	System.out.println(ipstring+" ---> "+String.valueOf(rsstring));
	}

}
