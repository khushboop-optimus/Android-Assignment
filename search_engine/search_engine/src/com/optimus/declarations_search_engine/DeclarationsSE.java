package com.optimus.declarations_search_engine;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
/**
 * 
 * DeclarationSE class basically declares all the variables and constants being used.
 *
 */
public class DeclarationsSE {
	static public int noOfKeywordsAllowed=10; //restricts user to input a string of maximum this size.
	static public List<String> webPages = new ArrayList<String>();//stores web pages entered by user
	static public List<String> queries = new ArrayList<String>();//stores queries entered by user
	static public String[] splitQuery=new String[10]; //stores query after being splitted 
	static public SortedMap<Integer,Integer> optimalPages = new TreeMap<>();//stores optimal pages per query.
   
}
