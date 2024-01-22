package com.devamatre.appsuite.jdk5scjp;

class A_Ex {A_Ex() throws Exception {}}

abstract class W {
	static protected void doTest() {
		System.out.println("W.doTest()");
	}
	public abstract void doStuff();
}
class G{public String toString() {return "G";}}
class X extends W {
	static protected void doTest() {
		System.out.println("X.doTest()");
	}
	public void doStuff() {
		System.out.println("X Impl");
	}
}

abstract class Y extends X {
	public abstract void doStuff();
}

class Z extends Y {
	public void doStuff() {
		System.out.println("Z Impl");
	}
}

public class TestEx {

	public String m1() throws Exception {
		throw new Exception();
	}
	
	private final void x() {}
	
//	static int m() {return ;}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
// System.out.println("" + m());
		W w = new X();
		w.doStuff();
		w = new Z();
		w.doStuff();
		TestEx t = new TestEx();
		t.x();
		try {
			t.m1();
			System.out.println("hello");
		}catch(Exception e) {}
	}
}
