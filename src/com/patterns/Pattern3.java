package com.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print(c%15 +" ");
				c++;
			}
			System.out.println();
		}
	}

}
