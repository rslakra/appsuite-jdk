package com.devamatre.appsuite.jdk5scjp.threads;


public class TestPrivate {
	private int i;

	private void test() {
		System.out.println("test");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestPrivate tp = new TestPrivate();
		System.out.println(tp.i);
		tp.test();
	}
}
