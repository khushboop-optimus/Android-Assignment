package com.example.details;

public class ExpandableListTestData {

	// static int parentCount,childCount;
	private static String[] parentList = { "            India",
			"            Pakistan", "            USA", "            Australia",
			"            England" };
	private static String[][] childList = {
			{ "            Delhi", "            Mumbai" },
			{ "            Islamabad", "            Karachi" },
			{ "            Chicago", "            New York" },
			{ "            Sydney", "            Melbourne" },
			{ "            Manchester", "            London" } };

	public static String getParent(int parentCount) {
		return parentList[parentCount];

	}

	public static String getChild(int childCount, int childCount2) {

		return childList[childCount][childCount2];
	}

}
