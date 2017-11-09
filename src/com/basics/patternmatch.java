package com.basics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class patternmatch {

	
		// TODO Auto-generated method stub
	 
		    public static void main(String a[]){
		    	
		    	String str="Naga is awesome and she texts well";
		    	String pattern=".*texts.*";
		    	boolean ismatch=Pattern.matches(pattern, str);
		    	System.out.println("The text word repeats: "+ismatch);
		    	      
		    }
		    
		
	}



