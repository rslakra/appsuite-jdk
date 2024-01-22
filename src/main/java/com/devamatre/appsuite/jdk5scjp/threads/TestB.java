package com.devamatre.appsuite.jdk5scjp.threads;

public class TestB extends Thread {
	private static TestA ta = new TestA();
	private String s1;
	public void run() {System.out.println(ta.m(s1)); }
	
	TestB(String tName, String s) {
		super(tName);
		s1 = s;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestB a = new TestB("T1", "A");
		TestB b = new TestB("T2", "B");
		a.start();
		b.start();
	}
}

class TestA{
		private String s1;
		public synchronized String m(String s) {
			s1 = s;
			try {
				Thread.sleep(1);
			}catch(InterruptedException ie) {}
			return "[" + Thread.currentThread().getName() + "," + s1 + "]";
		}
}

