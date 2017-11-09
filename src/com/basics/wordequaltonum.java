package com.basics;

public class wordequaltonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="a2b3c4d5j6";
		char a[]=str.toCharArray();
		String res="";
	for(int i=0;i<a.length;i+=2)
	{
		char ch=a[i];
		int limit=Integer.parseInt(""+a[i+1]);
		for(int j=0;j<limit;j++)
		{
			res=res+ch;
			
		}
		
	}
	System.out.print(res);
		
	}	
}
	

