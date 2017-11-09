package com.basics;

import java.util.Scanner;

public class happynumber {
	
	 static int happy(int n)
	{
		int sum=0,rem;
		for(int i=n;i!=0;i=i/10)
		{
			
			rem=i%10;
			sum=sum+rem*rem;		
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int temp=num;
while(temp>9)
{
temp=happy(temp);
	}
if(temp==1)

System.out.println("it is a happy number");	

else
	System.out.println("it is not a happy number");
	}
	}
