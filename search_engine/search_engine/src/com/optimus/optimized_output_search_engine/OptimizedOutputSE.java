package com.optimus.optimized_output_search_engine;

import java.util.InputMismatchException;

import com.optimus.declarations_search_engine.DeclarationsSE;
import com.optimus.user_interface_search_engine.UserInterfaceSE;

/**
 * 
 * This class will perform the entire task and provide output
 * 
 */

public class OptimizedOutputSE {
	Integer[] pageNo = new Integer[10]; // stores page number from optimalPages(sorted map)				
	Integer[] pageValue = new Integer[10];// stores pagestrength from optimalPages(sorted map
	String s[] = new String[10];

	public void displayOutput() {
		try {
			int index = 0, noOfSpaces = 0, pageStrength;
			if (DeclarationsSE.queries.size() == 0) {
				System.out.println("you haven't entered any query!!");
				System.out
				.println("You have entered invalid value!! Now restart the application");
				return;
			}
			if (DeclarationsSE.webPages.size() == 0) {
				System.out.println("you haven't entered any webPage!!");
				System.out
				.println("You have entered invalid value!! Now restart the application");
				return;
			}

			for (int queryCount = 0; queryCount < (DeclarationsSE.queries)
					.size(); queryCount++) {
				DeclarationsSE.splitQuery = ((DeclarationsSE.queries)
						.get(queryCount)).split(" ");

				for (int webPageCount = 0; webPageCount < (DeclarationsSE.webPages)
						.size(); webPageCount++) {
					pageStrength = 0;

					for (int splitCount = 1; splitCount < ((DeclarationsSE.splitQuery).length); splitCount++) {
						if ((DeclarationsSE.webPages)
								.get(webPageCount)
								.contains(DeclarationsSE.splitQuery[splitCount])) {
							index = ((DeclarationsSE.webPages)
									.get(webPageCount))
									.indexOf(DeclarationsSE.splitQuery[splitCount]);

							noOfSpaces = (((DeclarationsSE.webPages)
									.get(webPageCount).substring(0, index))
									.length())
									- (((DeclarationsSE.webPages)
											.get(webPageCount).substring(0,
											index)).replace(" ", "").length());

							pageStrength = pageStrength
									+ ((DeclarationsSE.noOfKeywordsAllowed - (splitCount - 1)) * (DeclarationsSE.noOfKeywordsAllowed - (noOfSpaces - 1)));

						} else
							pageStrength = pageStrength + 0;
					}

					DeclarationsSE.optimalPages.put(pageStrength,
							(webPageCount + 1));

				}

				/** print optimal pages per query */
				System.out.println(" ");
				System.out.print("Q" + (queryCount + 1) + ":");

				DeclarationsSE.optimalPages.values().toArray(pageNo);
				DeclarationsSE.optimalPages.keySet().toArray(pageValue);
				for (int pageCount = (DeclarationsSE.optimalPages.size() - 1); pageCount >= 0; pageCount--) {

					if (pageCount == 0 && pageValue[pageCount] != 0)
						System.out.print("P" + pageNo[pageCount]);
					else if (pageCount < 5 && pageValue[pageCount] != 0)
					{
						System.out.print("P" + pageNo[pageCount]);
                          if(pageValue[pageCount-1] != 0)
                        	  System.out.print(","); 
					}
				}
				DeclarationsSE.optimalPages.clear();
			}

		} catch (InputMismatchException e1) {
			UserInterfaceSE.main(s);
			System.out
					.println("You have entered invalid value!! Now restart the application");
		} catch (IndexOutOfBoundsException e2) {
			
			System.out
					.println("You have entered invalid value!! Now restart the application");
		}
	}

}
