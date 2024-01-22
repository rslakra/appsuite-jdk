package com.devamatre.appsuite.jdk5scjp.generalization;

public class A {

	interface W {}
	int x =2;
	static class AI {
		AI() {
			System.out.println(new A().x);
		}
		interface X  {
			
		}
	}

	
 class Z {
	 Z() {
		 System.out.println(x);
	 }
	 
 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new A().x);
	}

}
