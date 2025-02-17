package com.github.IliaBoyaCF.integral.methods;

import com.github.IliaBoyaCF.integral.ApproximateIntegral;

import java.util.function.Function;

public abstract class Rectangles extends ApproximateIntegral.Method {
    @Override
    public double calculate(Function<Double, Double> f, double leftBorder, double rightBorder, int N) {
        final double h = (rightBorder - leftBorder) / N;
        double result = 0;
        for (int i = 0; i < N; ++i) {
            result += f_i(f, leftBorder, h, i);
        }
        return result * h;
    }

    protected abstract double f_i(Function<Double, Double> f, double leftBorder, double h, int i);
}
