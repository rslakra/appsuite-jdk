package com.rslakra.appsuite.jdk5scjp.threads;

public class A extends Thread {
	private int i;
	public void run() {
		i = 1;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
// case 1
		a.start();
		System.out.println(a.i);
		//case 2
		a.run();
		System.out.println(a.i);
	}
}
