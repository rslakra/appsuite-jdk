package com.devamatre.appsuite.jdk5scjp.test;

public class Ancestor {

	protected String nationality;
	
	protected String getNationality() {
		return nationality;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ancestor a = new Ancestor();
		System.out.println(a.getNationality());
	}

}
