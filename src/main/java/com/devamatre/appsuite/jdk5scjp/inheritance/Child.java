package com.devamatre.appsuite.jdk5scjp.inheritance;

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
