package com.rslakra.appsuite.jdk5scjp;

public class TestFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,4};
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(final int i : arr) {
			System.out.println(i);
		}
	}

}
