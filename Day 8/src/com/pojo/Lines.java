package com.pojo;

/**
 * Write a Java program to read first 3 lines from a file
 * 
 * @author Kavya Madhurima
 */

import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Lines {

	public void display() {

		String strLine = "";
		try {
			LineNumberReader reader = new LineNumberReader(
					new InputStreamReader(new FileInputStream("/D:/program3.txt"), "UTF-8"));

			while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
				System.out.println(strLine);
			}
			reader.close();

		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}
	}
}
