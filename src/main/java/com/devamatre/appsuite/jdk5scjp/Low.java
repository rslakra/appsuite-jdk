package com.devamatre.appsuite.jdk5scjp;

class High {
	private static int CONST = 5;
	protected High() {System.out.println("high"); }
	public static String go(int... a) {return "hi";}
}
public class Low extends High {
	private Low() {System.out.println("low ");}
	public static String go(Integer x, Integer y) {return "low1";}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(go(2, 23));		
		System.out.println(go(54));
		new Low();
	}

}
