package com.rslakra.appsuite.jdk5scjp.test;

public class ForLoopWithLabel {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] values = new int[]{2, 3, 4};
        out:
        for (int i = 0; i < values.length; System.out.println("Incrementing i : " + i), i++) {
            System.out.println("Body of loop i : " + i);
            for (int j = 0; j < 2; System.out.println("Incrementing j : " + j), j++) {
                System.out.println("j :" + j);
                if (j == 1) {
                    System.out.println("continuing....");
                    continue out;
                }
            }
            System.out.println("after if");
            // i++;
        }
        System.out.println("good-bye");
    }
}
