package com.basics;

public class binarytodecimal {

	
	public static double getbinarytodecimal(int binary)
	{
		int power=0;
		int decimal=0;
	
		while(true)
		{
			if(binary==0)
			{
				break;
		}
			else
			{
			int res=binary%10;
			decimal=(int) (decimal+res*Math.pow(2, power));
			binary=binary/10;
			power++;
			
		}
		}
		return decimal;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double ab=getbinarytodecimal(1000);
		
		System.out.println(ab);
		
	}

}
