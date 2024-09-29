package com.rslakra.appsuite.jdk5scjp.test;

public class Swill {
	public static void main(String[] args) {
	String s = "-";
	switch(TimeZone.CST) {
	case EST: s += "e";
	case CST: s += "c";
	case MST: s += "m";
	default: s += "X";
	case PST: s += "p";
	}
	System.out.println(s);
	}
	}
	enum TimeZone {EST, CST, MST, PST }
