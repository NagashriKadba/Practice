package com.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("nagashree.properties");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty("name");
		System.out.println(data);
	}

}
