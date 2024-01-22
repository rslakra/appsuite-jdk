package com.devamatre.appsuite.jdk5scjp;

public class TestStatic {

	static {
		int x = 5;
	}
	static int x, y;
	
	public static void myMethod() {
		y = x++ + ++x;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		x--;
		myMethod();
		System.out.println(x + y + ++x);
	}

}
