package com.rslakra.appsuite.jdk8.annotation;

/**
 * @author Rohtash Lakra
 * @created 2/29/24 11:15 AM
 */
public class HolderTest {

    static class HolderImpl implements Holder {

        @Override
        public Integer convert(String s) {
            return s != null ? s.length() : 0;
        }
    }

    public static void main(String[] args) {
        Holder holder = new HolderImpl();
        int length = holder.convert("holder");
        System.out.println("length:" + length);
    }
}
