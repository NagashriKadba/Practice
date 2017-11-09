package com.basics;

import java.lang.Thread;
public class threads extends Thread {
	
	
	public void run()
	{
		System.out.println("My thread is in running state.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
threads t1=new threads();
t1.start();


		
	}

}
