package com.pojo;

/**
 * Write a Java program to append text to an existing file.
 * 
 * @author Kavya Madhurima
 */

import java.io.BufferedReader;

import java.io.IOException;

import java.io.FileReader;
import java.io.FileWriter;

public class AppendFile {
	public void display() {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		try {
			String filename = "/D:/program.txt";
			System.out.println();
			FileWriter fw = new FileWriter(filename, true);

			fw.write("Java Exercises\n");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("/D:/program.txt"));

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