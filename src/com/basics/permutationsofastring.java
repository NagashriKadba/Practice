package com.basics;

public class permutationsofastring {
	
	
	public static void stringpermuatation(String input)
	{
		stringpermutation("",input);
	}

	private static void stringpermutation(String permutation,String input )
	{
		if(input.length()==0)
		{
			System.out.println(permutation);
		}
		else
		{
			int n=input.length();
			for(int i=0;i<input.length();i++)
			{
				stringpermutation(permutation+input.charAt(i),input.substring(0,i)+input.substring(i+1,n));
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringpermuatation("nagashri");
		
	}

}
