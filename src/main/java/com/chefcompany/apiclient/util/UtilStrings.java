package com.chefcompany.apiclient.util;

public final class UtilStrings {

	public static void requiresPattern (String s, String pattern, String message) {
		if (!s.matches(pattern)) {
			throw new IllegalArgumentException(message);
		}
	}
	
	public static void requieresLength(String s, int lengthMin, int lengthMax, String message) {
		if (!(s.length() >= lengthMin && s.length() <= lengthMax)) {
			throw new IllegalArgumentException(message);
		}
	}
}
