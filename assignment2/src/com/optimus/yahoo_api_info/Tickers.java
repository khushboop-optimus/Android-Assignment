package com.optimus.yahoo_api_info;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Tickers extends Thread {

	public static int S;
	static int ticker_no;
	String symbol;
	Double up_interval, log_no;
	int log_count, no, total_updates;

	public Tickers(Double ui, String sm, Double ln, int tot_up) {

		up_interval = ui;
		symbol = sm;
		log_no = ln;
		total_updates = tot_up;
		log_count = 0;
		no = ++ticker_no;
	}

	public void run() {
		while (1 == 1) {
			S++;
			log_count++;
			if (S >= total_updates) {
				return;
			}
			display();
			try {
				Thread.sleep((long) (up_interval * 1000));
			} catch (InterruptedException e) {
				System.out.println("EXCEPTION CAUGHT IN tickers.Tickers.run:-"
						+ e);
			}
		}
	}

	public void display() {

		// System.out.println(symbol);
		try {
			URL comp = new URL("http://in.finance.yaho.com/d/quotes.csv?s="
					+ symbol + "&f=sl1pj3d1t1");

			URLConnection yc = comp.openConnection();
			BufferedReader rd2 = new BufferedReader(new InputStreamReader(
					yc.getInputStream()));

			String inputLine;
			String[] s1;

			while ((inputLine = rd2.readLine()) != null) {

				s1 = inputLine.split(",");
				System.out.println("     Ticker No-" + no + " Ticker-" + symbol
						+ " Current price-" + s1[1] + " Previous Close-"
						+ s1[2] + " Market Cap-" + s1[3] + " Date-" + s1[4]
						+ " Time-" + s1[5] + "    ");

				if (log_count >= log_no) {
					RandomAccessFile file = new RandomAccessFile(
							"c:/java/ticker.txt", "rw");
					// file.setLength(0);
					PrintWriter fileWriter = new PrintWriter(
							new FileOutputStream("c:/java/ticker.txt", true));
					fileWriter.print("current price-" + s1[1] + ","
							+ "previous close-" + s1[2] + "," + "market cap-"
							+ s1[3]);
					fileWriter.close();
				}
			}

			rd2.close();
		} catch (MalformedURLException e1) {
			System.out.println("EXCEPTION DETECTED :-" + e1);
		} catch (IOException e2) {
			System.out.println("EXCEPTION DETECTED :-" + e2);
		}

	}
}
