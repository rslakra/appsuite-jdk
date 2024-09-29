package com.rslakra.appsuite.jdk5scjp.generalization;

public class B {

	public static void main(String[] args) {
		Z z = new Z();
		X x = (Y)z;
		new B();
	}
}

class X {
}
class Y extends X {
}
class Z extends Y {
}


final class W {
	interface WI {}
}
