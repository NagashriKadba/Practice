package com.basics;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=4;
		String binary="";
		int rem;
		
while(num>0)
{
	rem=num%2;
	binary=rem+binary;
	num=num/2;
	
}
System.out.println(binary);

		
	}

}
