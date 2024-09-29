package com.rslakra.appsuite.jdk5scjp;

public class TestAssertiong {

	String f(int i) {
		switch(i) {
		case 0: return "A";
		case 1: return "B";
		case 2: return "C";
		default:
			assert false;
		}
		return null;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestAssertiong t = new TestAssertiong();
		for(int i=0; i< 4; i++)
			System.out.println(t.f(i));
	}

}
