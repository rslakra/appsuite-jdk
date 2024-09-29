package com.rslakra.appsuite.jdk5scjp.test;

public class BreakWithLabel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int ONE = 1;
		final int TWO = 2;
		System.out.println("ONE  : " + ONE);
		System.out.println("TWO  : " + TWO);
		System.out.println("~ONE : " + ~ONE);
		System.out.println("(ONE >> 2)  : " + (ONE >> 2));
		System.out.println("(ONE << 2)  : " + (ONE << 2));
		System.out.println("~(ONE << 2)  : " + ~(ONE << 2));
		labelledBreak();
	}
	
	static void labelledBreak() {
		System.out.println("Labled Break <Start>");
		int x = 6;
		test:
		if(x < 7) {
			System.out.println("Hello");
			break test;
		}
		System.out.println("Labled Break <End>");

	}

}
