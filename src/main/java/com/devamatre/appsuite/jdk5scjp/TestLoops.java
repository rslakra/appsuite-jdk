package com.devamatre.appsuite.jdk5scjp;

public class TestLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0;
		outer: for (int i = 0; i < 4; ++i)
			middle: for (int j = 0; j < 4; ++j)
				inner: for (int k = 0; k < 4; ++k) {
					System.out.println("Hello - " + ++counter);
					if ((k % 4) == 0)
						break outer;
				}

		String[] str = { "1", "2", "3" };
		for (String i : str)
			for (String j : str)
				System.out.println("i is " + i + " j is " + j);
	}
}
