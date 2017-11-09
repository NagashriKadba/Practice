package com.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class primefibo {

	public static void primeno(int n)
	{
		
		ArrayList l1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int input=sc.nextInt();
		boolean flag=false;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=true;
			break;
		}
		else
		{
			flag=false;
			l1.add(n);
			
		}
	}
	for(int j=0;j<l1.size();j++)
	{
		if(l1.contains(input))
		{
			flag=true;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println("is a prime");
	}
	else
	{
		System.out.println("not a prime");
	}
		}
	
	
	public static void fibonnaci(int n)
	{
		
		ArrayList l2=new ArrayList();	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int input=sc.nextInt();
	boolean flag=true;
	int fib1=0,fib2=1;
	int fib3;
	for(int i=3;i<10;i++)
	{
		fib3=fib1+fib2;
		l2.add(fib3);
		fib1=fib2;
		fib2=fib3;
		System.out.println(fib3);
	}
	for(int j=0;j<l2.size();j++)
	{
		if(l2.contains(input))
		{
			flag=false;
			break;
		}
	}
	if(flag)
	{
		System.out.println("not a fibo");
	}
	else
	{
		System.out.println("is a fibo");
	}
		
		}
		
	
																						
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primeno(10);
		fibonnaci(8);
		
	}

	
	
}
