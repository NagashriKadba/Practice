package com.basics;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		
		
	while(num>0)
	{
		int fact=1;
		int rem=num%10;
		for(int i=rem;i>0;i--)
		{
			fact=fact*i;
		}
			sum=sum+fact;
			num=num/10;
	}
		if(temp==sum)
		{
			System.out.println("It is a strong");
		}
		else
		{
			System.out.println("It is not an strong");
		}
		
	}

}
