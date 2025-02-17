package com.github.IliaBoyaCF;

import java.util.function.Function;

public class LeftRectangles extends Rectangles {

    @Override
    protected double f_i(Function<Double, Double> f, double leftBorder, double h, int i) {
        return f.apply(leftBorder + h * i);
    }
}
