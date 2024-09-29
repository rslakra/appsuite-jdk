package com.rslakra.appsuite.jdk5scjp.test;

public class TestingImpl implements TestInterface {

	public static void main(String[] args) {
		TestInterface.Testing test = new TestInterface.Testing();
		test.setValue(10);
		System.out.println("value : " + test.getValue());
	}
}
