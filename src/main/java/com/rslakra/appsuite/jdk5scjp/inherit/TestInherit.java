package com.rslakra.appsuite.jdk5scjp.inherit;

import com.rslakra.appsuite.jdk5scjp.Child;

public class TestInherit {

	public TestInherit() {
		// final int x = 10;
		System.out.println("TestInherit");
		Child c = new Child();
		// System.out.println(c.getNationality()); //error
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestInherit();
	}

}