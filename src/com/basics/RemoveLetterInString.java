package com.basics;


public class RemoveLetterInString {

	public static void main(String[] args) {
		String str="lavanya,";
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
		
		
		if(ch == 'a')
			count++;
		
		
		}
		System.out.println("a is repeated " + count +" times.");
		
		System.out.println("------------------------");
		
	
				String str1="ABCDEFABDABC,";
				int count1=0;
				for(int i=0;i<str1.length();i++){
				
				
				if(str1 == "ABC")
					count1++;
				
				}
				System.out.println("a is repeated " + count1 +" times.");
			}
			
		
}
