package com.devamatre.appsuite.jdk5scjp.regex;
import java.util.regex.*;

public class RegexSmall {
	public static void main(String [] args) {
		Pattern p = Pattern.compile("ab"); // the expression
		Matcher m = p.matcher("abaaaba"); // the source
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		System.out.println("=============================");
		testGreedy();
		System.out.println("=============================");
		testPattern();
	}
	
	static void testGreedy() {
		Pattern p = Pattern.compile(".*?xx"); // the expression
		Matcher m = p.matcher("yyxxxyxx"); // the source
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}
	
	static void testPattern() {
		Pattern p = Pattern.compile("\\d\\w"); // the expression
		Matcher m = p.matcher("ab4 56_7ab"); // the source
		while(m.find()) {
			System.out.println(m.start() + " " + m.pattern() + " " + m.group());
		}
	}

}
