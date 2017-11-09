package com.basics;

public class stringconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abc";
		String s2=s1;
		s1+="d";
		System.out.println(s1+" "+s2+" "+(s1==s2));
		StringBuffer s3=new StringBuffer("abc");
		StringBuffer s4=s3;
		s3.append("d");
		System.out.println(s3+" "+s4+" "+(s3==s4));
		
		
	}

}
