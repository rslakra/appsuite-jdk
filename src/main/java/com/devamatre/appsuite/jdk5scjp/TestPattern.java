package com.devamatre.appsuite.jdk5scjp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("hello");
		Matcher m  = p.matcher("hello, mr. hello how hello are you");
// while(m.find()) {
// System.out.println(m.start() + " : " + m.group());
// }
		System.out.println(m.matches());
		while(m.lookingAt()) {
			System.out.println(m.group());
		}
	}

}
