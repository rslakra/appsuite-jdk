package com.devamatre.appsuite.jdk5scjp;

class One {
	public Object method() {
		return new String("Base");
	}
}

class Two extends One {
	public String method() {
		return new String("Derived");
	}
}


public class TestInherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		One o = new Two();
// String str = o.method();
		String str = (String)o.method();
		System.out.println(str);
		
// Float f = 3.4f;
// float f1 = (float)3.4;
// System.out.println(f.equals(f1));
// System.out.println(f1.equals(f));
	}

}
