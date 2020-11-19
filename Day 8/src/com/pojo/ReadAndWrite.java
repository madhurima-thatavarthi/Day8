package com.pojo;

/**
 * Write a Java program to write and read a plain text file
 * 
 * @author Kavya Madhurima
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWrite {
	public void display() {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		try {
			String filename = "D:/program2.txt";
			FileWriter fw = new FileWriter(filename, false);
			
			fw.write("Hello!!!");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("D:/program2.txt"));
			
			while (strLine != null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine = br.readLine();
				System.out.println(strLine);
			}
			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
}

