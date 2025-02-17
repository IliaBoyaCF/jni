package com.github.IliaBoyaCF;

import java.util.function.Function;

public class ApproximateIntegral {

    private Method method;

    public record Initials(Function<Double, Double> f, double leftBorder, double rightBorder, int nodesCount) {}

    public static abstract class Method {
        public abstract double calculate(Function<Double, Double> f, double leftBorder, double rightBorder, int N);
    }

    public static double calculate(Method method, Function<Double, Double> f, double leftBorder, double rightBorder, int N) {
        return method.calculate(f, leftBorder, rightBorder, N);
    }

    public static double calculate(Method method, Initials init) {
        return method.calculate(init.f, init.leftBorder, init.rightBorder, init.nodesCount);
    }

}
