package com.devamatre.appsuite.jdk5scjp;

public class TestExcept {

	void f() {
		throw new RuntimeException();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestExcept te = new TestExcept();
		try {
			te.f();
		}catch(Throwable t) {
			try {
				throw (Exception)t;
			}catch(Exception e) {
				System.out.println("catch1");
			}finally {
				System.out.println("finally1");
			}
		}finally {
			System.out.println("finally2");
		}
	}

}
