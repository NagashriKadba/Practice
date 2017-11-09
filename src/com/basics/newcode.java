package com.basics;

public class newcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

javahungry();
		
	}
public static int javahungry()
{
	try
	{
		System.out.println("try");
		return 10;
	}
	catch(Exception e)
	{
		System.out.println("catch");
		return 20;
	}
finally
	{
		System.out.println("finally");
		return 30;
	}
}
	
}
