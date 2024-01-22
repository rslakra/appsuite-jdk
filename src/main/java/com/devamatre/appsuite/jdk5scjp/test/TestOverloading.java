package com.devamatre.appsuite.jdk5scjp.test;
import java.io.*;

public class TestOverloading {
	public static void main(String[] args) {
		String s = null;
		try { s = new Slave().doFileStuff();
		} catch ( Exception x) {
		s = "b"; }
		System.out.println(s);
	}
}

class Master {
	String doFileStuff() throws FileNotFoundException { return "a"; }
}

class Slave extends Master {
//	public static void main(String[] args) {
// String s = null;
// try { s = new Slave().doFileStuff();
// } catch ( Exception x) {
// s = "b"; }
// System.out.println(s);
//	}
	// insert code here
//	String doFileStuff() { return "b"; }
//	String doFileStuff() throws FileNotFoundException { return "b"; }
//	String doFileStuff() throws NumberFormatException { return "b"; }
	String doFileStuff() throws NumberFormatException,
	FileNotFoundException { return "b"; }
}
