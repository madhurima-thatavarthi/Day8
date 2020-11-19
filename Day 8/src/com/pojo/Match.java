package com.pojo;

/**
 * Write a java program to record the player details into the file. Get the player details name, 
 * teamName and number of matches played from the user and write those information in a comma seperated format (CSV).
 * 
 * @author Kavya Madhurima
 * 
 */

import java.io.BufferedWriter;
import java.io.FileOutputStream;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Match {

	public void display() {

		try (Scanner sc = new Scanner(System.in);
				FileOutputStream file = new FileOutputStream("D:\\program4.txt");
				OutputStreamWriter out = new OutputStreamWriter(file, "UTF-8");
				BufferedWriter buf = new BufferedWriter(out);
				PrintWriter writer = new PrintWriter(buf)) {
			System.out.println("Enter name of player=");
			String name = sc.nextLine();
			writer.print(name + " , ");
			System.out.println("Enter team name=");
			String team = sc.nextLine();
			writer.print(team + " , ");
			System.out.println("Enter number of players=");
			int players = sc.nextInt();
			writer.print(players + " , ");

			writer.println();

			System.out.println(name + "," + team + "," + players);
			
			sc.close();

		} catch (Throwable t) {
			t.printStackTrace();
		}

	}
}