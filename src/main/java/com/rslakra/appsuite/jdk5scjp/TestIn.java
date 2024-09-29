package com.rslakra.appsuite.jdk5scjp;

class C extends A {
	C() {
		System.out.println("C");
	}
}

class A {
	A() {
		System.out.println("A");
	}
}


class B extends C {
	B() {
		System.out.println("B");
	}
}

public class TestIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main ");
		B c = new B();
	}

}
