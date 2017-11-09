package com.basics;

import java.text.DecimalFormat;

public class percentageinastring {

	
		// TODO Auto-generated method stub
public static void percentage(String input)
{
		
		String s1="strinAAAAAgnum1234@#$fdhjkloj";
		
		int totalcount=s1.length();
		double lowercount=0;
		double uppercount=0;
		double specialcount=0;
		double other=0;
		double number=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isLowerCase(ch))
			{
				lowercount++;
			}
			else if(Character.isUpperCase(ch))
			{
				uppercount++;
			}
			else if(Character.isDigit(ch))
			{
				number++;
			}
			else
			{
				other++;
			}
		}
		double loweralpha=(lowercount)*100/totalcount;
		double upperalpha=(uppercount)*100/totalcount;
		double specialalpha=(specialcount)*100/totalcount;
		double otheralpha=(other)*100/totalcount;
		
		DecimalFormat formatter=new DecimalFormat("##.##");
		System.out.println("The upper percentage of the alphabets are "+formatter.format(upperalpha));
		System.out.println("The lower percentage of the alphabets are "+formatter.format(lowercount));
		System.out.println("The special percentage  of the alphabets are "+formatter.format(specialalpha));
		System.out.println("The other percentage  of the alphabets are "+formatter.format(otheralpha));

		
}
			

public static void main(String[] args) {
	percentage("The acTual Sentence is");
	percentage("My name is Naga @  andn & i am 5tastic 234567u8  a singer $");
	
	
}

}
