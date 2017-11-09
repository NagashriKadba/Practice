package com.basics;

public class immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = new String("JAVA");
		 
        System.out.println(s1);         //Output : JAVA
 
        s1.concat("J2EE");
 
        System.out.println(s1); 
        
        
        
        
        String s11 = "NAGA";
        
        String s22 = "NAGA";
 
        System.out.println(s11 == s22);         //Output : true
 
        s11 = s11 + "J2EE";
 
        System.out.println(s11 == s22);  
	}

}
