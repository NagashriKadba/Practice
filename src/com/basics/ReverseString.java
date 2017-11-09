package com.basics;

public class ReverseString {


			static void reverseEachWordOfString(String inputString)
			{
				String[] words = inputString.split(" ");
				
				String reverseString = "";
				
				for (int i = 0; i < words.length; i++) 
				{
					String word = words[i];
					
					String reverseWord = "";
					
					for (int j = word.length()-1; j >= 0; j--) 
					{
						reverseWord = reverseWord + word.charAt(j);
					}
					
					reverseString = reverseString + reverseWord + " ";
				}
				
				System.out.println(inputString);
				
				System.out.println(reverseString);
				
				System.out.println("-------------------------");
			}
			
//		    public static void main(String[] args) 
//		    {
//				reverseEachWordOfString("Java Concept Of The Day");
//				
//				reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
//				
//				reverseEachWordOfString("I am string not reversed");
//				
//				reverseEachWordOfString("Reverse Me");
//			}
	
			
		    public static void main(String[] args) 
		    {
				String s1 = "My name is lavanya";
				String[] str = s1.split(" ");
				String revString="";
				for(int i=0;i<str.length;i++){
					String word = str[i];
					String revWord = "";
					for(int j=word.length()-1;j>=0;j--){
						revWord = revWord + word.charAt(j);
						
					}
					revString = revString + revWord + " ";
					
				}
				System.out.println(revString);
			}

}
