package com.rslakra.appsuite.jdk5scjp.entities;

import com.rslakra.appsuite.jdk5scjp.Testable;

public class Apple extends Fruit implements Testable {

    //	public boolean isFruit(){
    // return true;
    //	}

    /**
     * @param args
     */
    public static void main(String[] args) {
        Fruit f = new Apple();
        System.out.println("Is Fruit : " + f.isFruit());
        System.out.println("Zero : " + ZERO + ONE);
    }

}
