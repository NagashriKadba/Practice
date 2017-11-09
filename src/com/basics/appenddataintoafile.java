package com.basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class appenddataintoafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter f1=null;
		BufferedWriter b1=null;
		PrintWriter p1 = null;
		try
		{
			f1=new FileWriter("/home/tyss/Textfiletowrite",true);
			b1=new BufferedWriter(f1);
			p1=new PrintWriter(b1);
			p1.println("Naga :23456");
			p1.println("Jam :6789");
			p1.println("calorie :5678");
			p1.println("Nutella :3456");
			System.out.println("Done");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				p1.close();
				b1.close();
				f1.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
