package com.basics;


class B 
{
	
	 public  void naga()
	 {
		 System.out.println("Naga likes to eat ferrorocher");
	 
	 }
	 	 
}
public class original extends B {

 public  void naga()
 {
	 System.out.println("Naga likes to eat Dairy Milk silk");
 }
 
public static void main(String[] args) {
		// TODO Auto-generated method stub
B b=new original();
b.naga();
 

	}

}


