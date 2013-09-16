package com.optimus.input_search_engine;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.optimus.declarations_search_engine.DeclarationsSE;

/**
 * 
 * InputSE class gets required values from user
 */
public class InputSE {
	/**
	 * getValues is the method to get user input.
	 */
	static public String pageOrQuery;// Variable for storing user input string

	/**
	 * this method checks for the input if no of keywords > allowed then prompts
	 * user to input valid string else if it begins with P or p enter it in
	 * webPages arraylist and if it begins with Q or q enter it in queries
	 * arraylist and if it doesn't begin with either of 4 characters specified
	 * above then prompts user to input a valid string
	 * 
	 */

	public static void getValues() {
		try {
			Scanner in1 = new Scanner(System.in);
			pageOrQuery = in1.nextLine();

			if ((pageOrQuery.length())
					- ((pageOrQuery.replace(" ", "")).length()) > (DeclarationsSE.noOfKeywordsAllowed - 1))
			// this statement checks if no of spaces in
			// pageOrQuery>noOfKewordsAllowed then its invalid
			{
				System.out
						.println("You have entered an invalid string-no of keywords in your query is more than allowed");
			}

			if (pageOrQuery.charAt(0) == 'P' || pageOrQuery.charAt(0) == 'p')
				DeclarationsSE.webPages.add(pageOrQuery);

			else if (pageOrQuery.charAt(0) == 'Q'
					|| pageOrQuery.charAt(0) == 'q') {
				DeclarationsSE.queries.add(pageOrQuery);

			} else
				System.out
						.println("You have entered an invalid string your string must begin with either of P,p,Q,q");
		} catch (InputMismatchException e) {
			System.out
					.println("You have entered invalid value!! Now restart the application");
		}
	}

}
