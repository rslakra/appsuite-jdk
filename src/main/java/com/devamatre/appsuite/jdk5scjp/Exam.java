package com.devamatre.appsuite.jdk5scjp;

import java.util.ArrayList;

/**
 * 
 * @created @created 2017-09-18 06:20:26 PM
 * @version 1.0.0
 * @since 1.0.0
 */
public class Exam {

	static String s = "-";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Adding.....");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			list.add(i);
		}
		System.out.println("=Ø================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		go();
		System.out.println(s);
		System.out.println("doStuff : " + doStuff(5));

		System.out.println(true ^ true);
		// System.out.println(CONST);

		char c = '\\';
		String s = "\\d";
		System.out.println("\\:" + c + ", \\d=" + s);

		String str = null;
		System.out.println(str);

		int x = 1;
		x += x++ * x;
		System.out.println(x);
		int m = 2;
		int n = 7;
		System.out.println(m | n);
	}

	{
		go();
	}
	static {
		go();
	}

	public static void go() {
		s += "s";
	}

	static int doStuff(int x) {
		return (x++) * x;
	}
}
