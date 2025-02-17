package com.github.IliaBoyaCF;

import java.util.function.Function;

public class SimpsonsRule extends ApproximateIntegral.Method {
    @Override
    public double calculate(Function<Double, Double> f, double leftBorder, double rightBorder, int N) {
        final double h = (rightBorder - leftBorder) / N;
        double result = 0.0;
        for (int i = 0; i < N; ++i) {
            result += f.apply(leftBorder + h * i) + 4 * f.apply(leftBorder + h * i + h / 2) +
                    f.apply(leftBorder + h * (i + 1));
        }
        return result * h / 6;
    }
}
