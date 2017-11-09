package com.basics;

public class Rotatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "JavaJ2eeStrutsHibernate";
		 
        String s2 = "StrutsHibernateJavaJ2ee";
        
        String s3=s1+s1;
        System.out.println(s3);
        if(s1.length()!=s2.length())
        {
        	System.out.println("s2 is not roatated version of s1");
        }
        else
        {
        	if(s3.contains(s2))
        	{
        		System.out.println("s2 is rotated version of s1");
        	}
        	else
        	{
        		System.out.println("S2 is not rotated version");
        	}
        }
		
	}

}
