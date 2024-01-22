package com.devamatre.appsuite.jdk5scjp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
		String s = "the email-ids are rohtash@yahoo.com and rohtash@gmail.com";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		while(m.find()) {
			System.out.println("The email id is : " + m.group());
		}
	}
}
