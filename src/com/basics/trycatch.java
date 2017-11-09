package com.basics;

public class trycatch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		javahungry();
	}
	
	public static int javahungry()
	{
		try{
			System.out.println("try");
			int x=4/0;
			return 10;		
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
		
		{
			System.out.println("finallyyyy");
			return 88;
		}
	
	}

}
