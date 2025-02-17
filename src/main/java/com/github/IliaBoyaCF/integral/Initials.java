package com.github.IliaBoyaCF.integral;

import java.util.function.Function;

public record Initials(Function<Double, Double> f, double leftBorder, double rightBorder, int nodesCount) {
    public static Initials create(Function<Double, Double> f, double leftBorder, double rightBorder, int nodesCount) {
        if (leftBorder >= rightBorder) {
            throw new IllegalArgumentException("Left border must be lower than right border.");
        }
        if (nodesCount < 0) {
            throw new IllegalArgumentException("Nodes count must be greater than zero.");
        }
        return new Initials(f, leftBorder, rightBorder, nodesCount);
    }
}

