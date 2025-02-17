package com.github.IliaBoyaCF.integral.methods;

import com.github.IliaBoyaCF.integral.ApproximateIntegral;

import java.util.function.Function;

public class LeftRectangles extends Rectangles {

    private static final ApproximateIntegral.Method INSTANCE = new LeftRectangles();

    @Override
    protected double f_i(Function<Double, Double> f, double leftBorder, double h, int i) {
        return f.apply(leftBorder + h * i);
    }

    public static ApproximateIntegral.Method getInstance() {
        return INSTANCE;
    }
}
