package com.main;

/**
 * Write a java program to record the player details into the file. Get the player details name, 
 * teamName and number of matches played from the user and write those information in a comma seperated format (CSV).
 * 
 * @author Kavya Madhurima
 * 
 */

import com.pojo.Match;

public class MatchMain {

	public static void main(String[] args) {
		Match match = new Match();
		match.display();

		match = null;

	}

}
