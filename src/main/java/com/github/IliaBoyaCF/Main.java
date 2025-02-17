package com.github.IliaBoyaCF;

public class Main {

    public static void main(String[] args) {
        System.out.println(ApproximateIntegral.calculate(new AverageRectangles(), new ApproximateIntegral.Initials(Math::cos, -1, 1, 100)));
    }
}
