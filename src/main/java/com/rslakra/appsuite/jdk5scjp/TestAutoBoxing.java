package com.rslakra.appsuite.jdk5scjp;

public class TestAutoBoxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a, b, c=3;
		a = c;
		System.out.println(a == c);
		System.out.println(a.equals(c));
	}

}
