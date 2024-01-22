package com.devamatre.appsuite.jdk5scjp.threads;

class A1 extends Thread {
	String[] sa;
	public A1(String[] sa) {this.sa = sa;}
	public void run() {
		synchronized(sa) {
			System.out.println(sa[0] + sa[1] + sa[2]);
		}
	}
}

public class AThread {
	private static String[] sa = new String[] {"X", "Y" , "Z"};
	
	private void test() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		new AThread().test();	//accessible in same class
		
		synchronized(sa) {
			Thread t = new A1(sa);
			t.start();
			sa[0] = "A";sa[1] = "B";sa[2] = "C";			
		}
	}
}


