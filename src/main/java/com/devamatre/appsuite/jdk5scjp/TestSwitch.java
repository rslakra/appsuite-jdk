package com.devamatre.appsuite.jdk5scjp;

public class TestSwitch {
	final static short w = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char digit = 'a';
		for (int i = 0; i < 10; i++) {
			switch(digit) {
				case 'x':
				{
					int j = 0;
					System.out.println(j);
				}
				default:
				{
					int j = 100;
					System.out.println(j);
				}
			}
		}
// int i = j;
// System.out.println(j);
		int x = 4;
		switch(x) {
			case w: break;
			case w+2: break;
			default: break;
		}
	}

}
