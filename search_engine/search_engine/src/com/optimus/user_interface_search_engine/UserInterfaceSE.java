package com.optimus.user_interface_search_engine;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.optimus.declarations_search_engine.DeclarationsSE;
import com.optimus.input_search_engine.InputSE;
import com.optimus.optimized_output_search_engine.OptimizedOutputSE;

public class UserInterfaceSE {
	static Scanner in = new Scanner(System.in);// scanner in UserInterfaceSE to
												// get values from user

	public static void main(String args[]) {
		int moreInput = 1;// local variable that keeps track whether user wish
							// to enter more pages or queries
		OptimizedOutputSE output = new OptimizedOutputSE();
		/**
		 * while loop basically asks user to enter his choice 1-to enter more
		 * pages or queries 0-to exit from while loop
		 * 
		 */

		try {
			while (moreInput != 0) {
				System.out.println("Enter 1 to continue OR 0 if you are done!");
				moreInput = in.nextInt();
				if (moreInput == 1) {
					System.out
							.println("please enter page OR query and please make sure that it begins with either of P,p,Q,q and no of keywords must not exceed--"
									+ DeclarationsSE.noOfKeywordsAllowed);
					InputSE.getValues();

				} else if (moreInput == 0) {
					output.displayOutput();
					return;
				} else {
					System.out
							.println("your input is invalid please enter either 0 or 1");

				}
			}

		} catch (InputMismatchException e1) {
			System.out
					.println("You have entered invalid value!! Now restart the application");

		} catch (IndexOutOfBoundsException e2) {
			
			System.out
					.println("You have entered invalid value!! Now restart the application");
		}

	}
}
