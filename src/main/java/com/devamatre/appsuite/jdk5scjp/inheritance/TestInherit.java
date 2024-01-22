package com.devamatre.appsuite.jdk5scjp.inheritance;

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
