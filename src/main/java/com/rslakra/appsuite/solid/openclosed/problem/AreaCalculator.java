package com.rslakra.appsuite.solid.openclosed.problem;

/**
 * Author: Rohtash Singh Lakra
 * Created: 5/9/20 1:13 PM
 * Version: 1.0.0
 */
public class AreaCalculator {
    private Object[] shapes;

    public AreaCalculator(Object... shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        double sum = 0;
        for (Object shape : shapes) {
            // commented intentionally
            // sum += shape.area();
        }

        return sum;
    }
}
