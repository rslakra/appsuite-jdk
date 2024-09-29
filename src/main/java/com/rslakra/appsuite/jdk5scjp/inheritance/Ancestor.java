package com.rslakra.appsuite.jdk5scjp.inheritance;

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
