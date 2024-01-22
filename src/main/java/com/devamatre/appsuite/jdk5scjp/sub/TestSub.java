package com.devamatre.appsuite.jdk5scjp.sub;

import com.devamatre.appsuite.jdk5scjp.TestSuper;

public class TestSub extends TestSuper {

	TestSuper supperX = new TestSuper();
	TestSub suby = new TestSub();
	
	void subTest( ) {
		suby.superTest();
		int i;
// i = suby.supperX;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
