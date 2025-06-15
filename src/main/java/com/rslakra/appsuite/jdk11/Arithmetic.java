package com.rslakra.appsuite.jdk11;

/**
 * @author Rohtash Lakra
 * @version 1.0.0
 * @since 05/05/2024 1:58 PM
 */
public class Arithmetic {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] input = new int[]{-1, 1, 0, -1, -3, 3};
        for (int i = 0; i < input.length; i++) {
            // System.out.println("i:" + i + ", i+1:" + (i + 1) + ", input[i] * input[i + 1]:" + input[i] * input[i + 1]);
            System.out.println("input[" + i + "] + 0:" + (input[i] + 0));
        }
    }
}
