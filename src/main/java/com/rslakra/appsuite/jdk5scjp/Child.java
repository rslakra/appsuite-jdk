package com.rslakra.appsuite.jdk5scjp;

import com.rslakra.appsuite.jdk5scjp.inherit.Parent;

public class Child extends Parent {

	public Child() {
		nationality = "Red Indian";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.getNationality());
	}

}
