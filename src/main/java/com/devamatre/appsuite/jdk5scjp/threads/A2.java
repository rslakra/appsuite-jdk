package com.devamatre.appsuite.jdk5scjp.threads;

public class A2 extends Thread {
	
	static long sTime;
	public void run() {
		for (int i = 0; i < 9999; i++) {Math.sin(i); }
		String name = Thread.currentThread().getName();
		long time = System.currentTimeMillis();
		System.out.println(name + " done at " + (time - sTime));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A2 t1 = new A2(); A2 t2 = new A2();
		t1.setName("T1"); t2.setName("T2");
		t1.setPriority(Thread.MIN_PRIORITY); 
		t2.setPriority(Thread.MAX_PRIORITY);
		sTime = System.currentTimeMillis();
		t1.start();
		t2.start();
	}
}
