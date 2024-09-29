package com.rslakra.appsuite.jdk5scjp;

enum Grade {A{public String toString() {return "Book";}}, B, C, D};

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Grade grade = Grade.A;
		switch(grade) {
		case A:
			System.out.println(grade);
		default:
			System.out.println("Default");
		}
	}

}
