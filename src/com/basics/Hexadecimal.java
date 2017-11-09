package com.basics;

import java.util.Scanner;

public class Hexadecimal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String input = sc.next();
		String s1=input.toUpperCase();
		String digits="0123456789ABCDEF";
	    int val=0;
		for(int i=0;i<input.length();i++)
		{
			char ch=s1.charAt(i);
			int d=digits.indexOf(ch);
			 val=16*val+d;		
		}
		System.out.println(val);
	}

}

