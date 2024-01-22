package com.devamatre.appsuite.jdk5scjp.collection;

import java.util.*;

public class Comp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] words = {"Good", "Bad", "Ugly"};
		Comparator<String> best = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s2.charAt(1) - s1.charAt(1); //reverse
//				return s1.charAt(1) - s2.charAt(1); //alphabetically
			}
		};
		Arrays.sort(words, best);
		System.out.println(words[0]);
	}

}
