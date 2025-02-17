package com.github.IliaBoyaCF.integral.methods;

import com.github.IliaBoyaCF.integral.ApproximateIntegral;

import java.util.function.Function;

public class SimpsonsRule extends ApproximateIntegral.Method {
    private static final ApproximateIntegral.Method INSTANCE = new SimpsonsRule();
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

    public static ApproximateIntegral.Method getInstance() {
        return INSTANCE;
    }
}
