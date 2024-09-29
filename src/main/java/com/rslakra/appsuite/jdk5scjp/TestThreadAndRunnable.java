package com.rslakra.appsuite.jdk5scjp;

class MyThread extends Thread {
	
	MyThread(){}
	MyThread(Runnable r){super(r);}
	
	public void run() {
		System.out.println("Inside Thread ");
	}
}

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Inside Runnable");
	}
}

public class TestThreadAndRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread().start();
		new MyThread(new MyRunnable()).start();
// new Thread(new MyRunnable()).start();
	}

}
