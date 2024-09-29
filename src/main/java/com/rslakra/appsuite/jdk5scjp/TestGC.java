package com.rslakra.appsuite.jdk5scjp;

public class TestGC {
	int x = 4;
	Object obj = new String();
	protected void finalize() throws Throwable { 
		System.out.println("TestGC.finalize()");
	}		
	public static void main(String[] args) {
		TestGC gc = new TestGC();
		gc.obj = null;
		System.gc();
	}
}
