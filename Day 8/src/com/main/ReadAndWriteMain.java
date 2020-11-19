package com.main;

import com.pojo.ReadAndWrite;

/**
 * Write a Java program to write and read a plain text file
 * 
 * @author Kavya Madhurima
 */

public class ReadAndWriteMain {

	public static void main(String[] args) {
		ReadAndWrite readAndWrite=new ReadAndWrite();
		readAndWrite.display();
		
		readAndWrite=null;
	}

}
