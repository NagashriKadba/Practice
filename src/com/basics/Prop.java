package com.basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("Lavanya.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty("name");
		System.out.println(data);
	}

}
