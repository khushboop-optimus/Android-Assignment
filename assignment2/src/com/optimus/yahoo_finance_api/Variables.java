/**
 * 
 * 
 */
package com.optimus.yahoo_finance_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.optimus.yahoo_api_info.Tickers;

public class Variables {
	int no_comp, tot_up;
	Double lg_in;
	String cm_t[] = new String[32000];
	Double up_in[] = new Double[32000];

	public static void main(String args[]) throws NumberFormatException,
			IOException {

	}

	/**
	 * This is to get inputs
	 */
	public void getvalues() {
		BufferedReader rd1 = new BufferedReader(
				new InputStreamReader(System.in));
		
		//Ask user
		try {
			System.out.println("Please Enter Number Of Companies.");
			no_comp = Integer.parseInt(rd1.readLine());
			System.out
					.println("Please Enter Time After Which you want Logs to be Stored.");
			lg_in = Double.parseDouble(rd1.readLine());
			System.out
					.println("Please Enter Total no of updates after which you want to end the process.");
			tot_up = Integer.parseInt(rd1.readLine());

			for (int i = 0; i < no_comp; i++) {
				System.out.println("Please Enter Company Ticker.");
				cm_t[i] = (rd1.readLine());
				System.out
						.println("Please Enter Time After Which Data Should Be Refereshed.");
				up_in[i] = Double.parseDouble(rd1.readLine());
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
