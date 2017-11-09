package com.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readtext {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int linecount=0;
int wordcount=0;
int charactercount=0;

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File("/home/tyss/Desktop/textfile")));
		
			String reader = br.readLine();

			while (reader != null) {
				linecount++;

				String[] arr = reader.split(" ");
				for (int i = 0; i < arr.length; i++) {
					wordcount = wordcount + arr.length;
				}
				for (String chars : arr) {
					charactercount = charactercount + chars.length();
				}

				reader = br.readLine();
			}
			System.out.println(linecount);
			System.out.println(wordcount);
			System.out.println(charactercount);
		} finally {

		}
	}
}
