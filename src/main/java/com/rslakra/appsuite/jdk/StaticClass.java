package com.rslakra.appsuite.jdk;

/**
 * @author Rohtash Lakra (rslakra.work@gmail.com)
 * @version 1.0.0
 * @since 04/20/2024 5:48 PM
 */
public class StaticClass {

    public static void callStaticWithNullInstance() {
        System.out.println("callStaticWithNullInstance:" + Thread.currentThread().getName());
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        StaticClass staticClass = null;
        staticClass.callStaticWithNullInstance();
    }
}
