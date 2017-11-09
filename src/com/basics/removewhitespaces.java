package com.basics;

public class removewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hi Naga eat baby corn manchurian      in Nisarga its really yummy";
		System.out.println(s1.replaceAll("\\s",""));
		
		String s2="Hi Naga eat Vanghi bath which mum sent today";
		char arr[]=s2.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]!=' ')&&(arr[i]!='\t'))
			sb.append(arr[i]);
		}
		
System.out.println(sb);
	}

}
