package com.basics;

public class printnonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printnu(10);
		
	}
	
		
		public static void printnu(int n)
		{
			if(n>=1)
			{
			System.out.println(n);
			printnu(n-1);
			}
			
		}
	

}
