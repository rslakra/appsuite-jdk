package com.rslakra.appsuite.jdk5scjp;

class Super {
	void print(Super s) {
		System.out.println("Super");
	}
}

class Base extends Super {
	void print(Base b) {
		System.out.println("Base");
	}
}


class Derived extends Base {
	static void print(Derived s) {
		System.out.println("Derived");
	}
}


public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Super a1 = new Super();
		Super b1 = new Base();
		Base c1 = new Derived();
		a1.print(new Base());
		b1.print(new Derived());
		c1.print(new Derived());
	}

}
