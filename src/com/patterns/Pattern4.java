package com.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((i+j)>n){
					
				System.out.print(i);
				
				}else{
					
					System.out.print(" ");
				}
			
			}
			System.out.println( );	
			
		}
	}

}
