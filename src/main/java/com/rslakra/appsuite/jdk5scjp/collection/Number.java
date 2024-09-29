package com.rslakra.appsuite.jdk5scjp.collection;

import java.util.*;

public class Number {
	private Set<Integer> numbers = new TreeSet<Integer>();
//	private Set numbers = new TreeSet(); //not allowed

	public Number(int... nums) {
		for(int i:nums)
			numbers.add(i);
	}
	
	public Number negate() {
		Number negate = new Number();
		for(int i: numbers)
			negate.numbers.add(-i);
		return negate;
	}
	
	public void show() {
		for(int i : numbers)
			System.out.println(i + " ");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Number(1,3,-5).negate().show();
	}

}
