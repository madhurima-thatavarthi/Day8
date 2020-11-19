package com.pojo;

/**
 * Write a Java program by using BufferedReader class to prompt a user to input 
 * his/her name and then the output will be shown
 * 
 * @author Kavya Madhurima
 * 
 */

import java.io.*;

public class Message {

	public void disply() throws Exception {
		FileReader fr = new FileReader("D:\\program.txt");
		BufferedReader br = new BufferedReader(fr);

		int i;
		while ((i = br.read()) != -1) {
			System.out.print((char) i);
		}
		br.close();
		fr.close();
	}
}

