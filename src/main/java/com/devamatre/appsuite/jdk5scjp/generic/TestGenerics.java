package com.devamatre.appsuite.jdk5scjp.generic;

import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

class C extends B {
}

class D {
}

public class TestGenerics {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// valid assignments...
		List list = new ArrayList<A>();
		List<?> list1 = new ArrayList<Object>();
		List list2 = new ArrayList<Object>();
		List<? extends A> list3 = new ArrayList<B>();
	}
	
}
