package com.rslakra.appsuite.jdk5scjp;

import java.util.Formatter;
import java.util.Locale;

/**
 * 
 * @author Rohtash Lakra
 * @created 2017-09-18 06:26:13 PM
 * @version 1.0.0
 * @since 1.0.0
 */
public class TestStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		StringBuilder sBuilder = new StringBuilder();
		Formatter formatter = new Formatter(sBuilder, Locale.US);
		formatter.format("PI=%12.10f", Math.PI);
		
		String str = new String();
		str = String.format("%1s %2s", "Rohtash", "Singh");
		System.out.println(str);
		System.out.println(sBuilder.toString());
	}

}
