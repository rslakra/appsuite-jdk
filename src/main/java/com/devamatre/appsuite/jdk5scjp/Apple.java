package com.devamatre.appsuite.jdk5scjp;

import com.devamatre.appsuite.jdk5scjp.entities.Fruit;

public class Apple extends Fruit implements Testable {

	// public boolean isFruit(){
	// return true;
	// }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit f = new Apple();
		System.out.println("Is Fruit : " + f.isFruit());
		System.out.println("Zero : " + ZERO + ONE);
	}

}
