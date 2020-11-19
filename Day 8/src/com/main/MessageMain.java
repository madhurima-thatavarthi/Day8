package com.main;

import com.pojo.Message;

/**
 * Write a Java program by using BufferedReader class to prompt a user to input 
 * his/her name and then the output will be shown
 * 
 * @author Kavya Madhurima
 * 
 */

public class MessageMain {

	public static void main(String[] args) throws Exception {
		Message message=new Message();
		message.disply();
		
		message=null;
	}

}
