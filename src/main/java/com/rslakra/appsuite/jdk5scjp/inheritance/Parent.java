package com.rslakra.appsuite.jdk5scjp.inheritance;

public class Parent extends Ancestor{

	public Parent() {
		super();
		nationality = "Indian";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.getNationality());
	}

}
