package com.rslakra.appsuite.jdk5scjp;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i =0;
		try {
			for(; true; i++) 
			{
				if(i/i++ > 0) break;
			}
			/*
			 * if you un-comment it and comment the same code below, you will
			 * know how the exceptions work.
			 */
// }catch(RuntimeException r) {
// System.out.println("RuntimeException");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(RuntimeException r) {
			System.out.println("RuntimeException");
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
	}

}
