package com.github.IliaBoyaCF.integral.methods;

import com.github.IliaBoyaCF.integral.ApproximateIntegral;

import java.util.function.Function;

public class RightRectangles extends Rectangles {
    private static final ApproximateIntegral.Method INSTANCE = new RightRectangles();

    @Override
    protected double f_i(Function<Double, Double> f, double leftBorder, double h, int i) {
        return f.apply(leftBorder + h * (i + 1));
    }

    public static ApproximateIntegral.Method getInstance() {
        return INSTANCE;
    }
}
