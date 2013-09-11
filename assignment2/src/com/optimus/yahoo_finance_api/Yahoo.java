package com.optimus.yahoo_finance_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.optimus.yahoo_api_info.Tickers;


public class Yahoo {
	public static void main(String args[]) {
		Variables v1 = new Variables();
		v1.getvalues();
		Tickers t[] = new Tickers[v1.no_comp];
		for (int j = 0; j < v1.no_comp; j++) {
			t[j] = new Tickers(v1.up_in[j], v1.cm_t[j], v1.lg_in, v1.tot_up);
			t[j].start();
			if (Tickers.S >= v1.tot_up) {
				System.out.println("TIMEOUT!!!");
				return;
			}
		}
	}
}
